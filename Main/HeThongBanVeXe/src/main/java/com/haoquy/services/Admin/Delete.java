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
public class Delete {
    public boolean DeleteBus(String kw) throws SQLException { 
        try {
            Connection conn = Utils.getConn();
            String sql = "DELETE FROM Bus WHERE id = ? ";
            PreparedStatement stm = conn.prepareStatement(sql);
            if (checkBusID(kw))
                stm.setString(1, kw);
            else return false;
        stm.executeUpdate();
        return true;
        } catch (SQLException e) {
            return false;
        }
        
    }   
}
