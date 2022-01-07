/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.services.Admin;

import com.haoquy.pojo.Bus;
import static com.haoquy.services.Check.checkBusID;
import static com.haoquy.services.Check.checkDestination;
import static com.haoquy.services.Check.checkTimeAndDate;
import com.haoquy.services.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HaoQuy
 */
public class Update {
    
    public boolean UpdateDateTime(Bus bus) throws SQLException
    {
        try {

            Connection conn = Utils.getConn();
            String sql = "UPDATE Bus SET bus_date =? ,bus_time=? WHERE id = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            if (checkTimeAndDate(bus.getDate(), "/",10,8))
                stm.setString(1, bus.getDate());
            else return false;
              if (checkTimeAndDate(bus.getTime(), ":",5,4))
                stm.setString(2, bus.getTime());
            else return false;
             if (checkBusID(bus.getId()))
                stm.setString(3, bus.getId());
            else return false;
            stm.executeUpdate();
            return true;
        }
        catch (SQLException e) {
                return false;
        }
    }
}
