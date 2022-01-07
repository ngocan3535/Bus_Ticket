/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HaoQuy
 */
public class Check {
    public static boolean checkSpecialCharacter(String s) {
         if (s == null || s.trim().isEmpty()) {
             return false;
         }
         Pattern p = Pattern.compile("[^A-Za-z0-9-đĐ-]");
         Matcher m = p.matcher(s);
        // boolean b = m.matches();
         boolean b = m.find();
         if (b == true)
           return false;
         else
            return true;
    }
     public static boolean checkBusID(String text)
    {
    String regex = ".*-.*";
    try { 
        if (!checkSpecialCharacter(text)) return false;
        if (text.length() != 7) return false;
        String[] arrOfStr = text.split("-"); 
        if (!Character.isDigit(text.charAt(5)) || !Character.isDigit(text.charAt(6)))
               return false;
        if (Character.isDigit(text.charAt(3)) || Character.isDigit(text.charAt(4)) || text.charAt(3) == '-' || text.charAt(4) == '-')
               return false;
        Integer.parseInt(arrOfStr[0]); 
    } catch(NumberFormatException | NullPointerException e) { 
        return false;
    }
    return true;
    }
     
   public static boolean checkDestination(String text)
   {
       try {
           Integer.parseInt(text); 
           return false;
       } catch(NumberFormatException | NullPointerException e) 
       {
           if (!checkSpecialCharacter(text)) return false;
           String[] location = {"ĐN","VT","BC","BD","HN",};
           for (var a : location)
               if (text.equals(a))
                   return true;
           return false;
       }
   
   }
    public static boolean checkTime(int h, int m)
    {
       
       if (h >= 0 && h <=24)
       {
           if (m >= 0 && m <= 60)
               return true;
       }
       return false;
    }
    public static boolean checkDate(int d, int m,int y)
    {
        if (y < 2020 || y > 2021) return false;
        else
        {
          if (y == 2020 && m == 12)
              if (d > 0 && d <= 31)
                  return true;
          if (y == 2021)
          {
              int t_31_n[] = {1,3,5,7,9,10,12};//Tháng có 31 ngày
              int t_30_n[] = {4,6,9,11};//Tháng có 30 ngày
              for (var a : t_31_n)
                  if (m == a)
                     if (d > 0 && d <= 31)
                          return true;
              for (var a : t_30_n)
                  if (m == a)
                      if (d > 0 && d <= 30)
                          return true;
              if (m == 0) return false;
              if (m == 2)
                  if (d >0 && d <=28)
                      return true;
          }
            return false;
        }
      
    }
    public static boolean checkTimeAndDate(String text,String kw,int max,int min)
   {
       try {
           if (text.length() > max || text.length() < min ) return false;
           String[] arrOfStr = text.split(kw);
           for (String a : arrOfStr) 
            Integer.parseInt(a);
           //Trường hợp ngày không vượt quá ngày cho  phép
           if (kw.equals("/"))
               if(!checkDate(Integer.parseInt(arrOfStr[0]),Integer.parseInt(arrOfStr[1]),Integer.parseInt(arrOfStr[2])))
                   return false;
           //Trường hợp thời gian không dưới 0 và quá 24h
           if(kw.equals(":"))
           {
               if (text.length() == max && Integer.parseInt(arrOfStr[0]) < 10 && Integer.parseInt(arrOfStr[1]) < 10 ) return false;
               if(text.length() == min && arrOfStr[0].length() > 1 && arrOfStr[1].length() < 2) return false;
               if(!checkTime(Integer.parseInt(arrOfStr[0]),Integer.parseInt(arrOfStr[1]))) return false;
           }
       } catch(NumberFormatException | NullPointerException e) 
       {
           return false;
       }
       catch(Exception e) 
       {
           return false;
       }
       return true;
   
   }
 
}
