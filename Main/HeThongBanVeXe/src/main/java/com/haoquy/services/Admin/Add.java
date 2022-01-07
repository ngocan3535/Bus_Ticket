/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.services.Admin;

import com.haoquy.pojo.Bus;
import static com.haoquy.services.Check.*;
import com.haoquy.services.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author HaoQuy
 */
public class Add {
  
    public  boolean addJourney(Bus bus) throws SQLException {
        try {

            Connection conn = Utils.getConn();
            String sql = "INSERT INTO salesticket.bus (id, des_start,des_end ,bus_time, bus_date) "
                        + "VALUES(?, ? ,?, ?, ?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            if (checkBusID(bus.getId()))
                stm.setString(1, bus.getId().toUpperCase());
            else return false;
            stm.setString(2,"HCM");
            if (checkDestination(bus.getTo()))
                stm.setString(3, bus.getTo());
            else return false;

            if (checkTimeAndDate(bus.getTime(), ":",5,4))
                stm.setString(4, bus.getTime());
            else return false;
            if (checkTimeAndDate(bus.getDate(), "/",10,8))
                stm.setString(5, bus.getDate());
            else return false;
            stm.executeUpdate();
            return true;
         } catch (SQLException e) {
             return false;
        }
    }
}
