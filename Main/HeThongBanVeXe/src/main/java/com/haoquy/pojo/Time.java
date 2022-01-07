/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HaoQuy
 */
public class Time {
    public static boolean CompareTime(Ticket t, int time)
     {
           Date date = Calendar.getInstance().getTime();  
           DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
           String strDate = dateFormat.format(date); 
           DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");  
           String timeDate = timeFormat.format(date);  
           
           String[] current_time = timeDate.split(":"); 
           String[] current_date = strDate.split("/");
           String[] ticket_time = t.getTime().split(":");
           String[] ticket_date = t.getDate().split("/");
           for (int i =0;i < 3; i++)
           {
               if (!current_date[i].equals(ticket_date[i]))
                   return false;
           }
           int sum_ctime = Integer.parseInt(current_time[0])*3600 +Integer.parseInt(current_time[1])*60 + Integer.parseInt(current_time[2]);
           int sum_ttime = Integer.parseInt(ticket_time[0])*3600 +Integer.parseInt(ticket_time[1])*60 + Integer.parseInt(ticket_time[2]);
           if (sum_ttime - sum_ctime > (time *60))
               return false;
           return true;
     }
}
