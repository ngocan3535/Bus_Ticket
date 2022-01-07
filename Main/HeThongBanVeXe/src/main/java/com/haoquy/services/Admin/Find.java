/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.services.Admin;

import com.haoquy.pojo.Bus;
import com.haoquy.services.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HaoQuy
 */
public class Find {
     public List<Bus> FindBus(String kw) throws SQLException
    {
        Connection conn = Utils.getConn();
        String sql = "Select * FROM BUS WHERE ID = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, kw);
        ResultSet rs = stm.executeQuery();
        List<Bus> buses = new ArrayList<>();
        while (rs.next()) 
        {
           String id = rs.getString("id");
           String from = rs.getString("des_start");
           String to = rs.getString("des_end");
           String time = rs.getString("bus_time");
           String date = rs.getString("bus_date");
           Bus bus = new Bus(id, from,to,time,date);
           buses.add(bus);
       }
        return buses;
    }
     public boolean checkFind(String kw) throws SQLException
     {
         List<Bus> buses = FindBus(kw);
         if (buses.isEmpty()) return false;
         return true;
     }
     
}
