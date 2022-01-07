/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.services;

import com.haoquy.pojo.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HaoQuy
 */
public class Delete {
    public static void DeleteTicket(Ticket t) throws SQLException { 
       Connection conn = Utils.getConn();
       String sql = "DELETE FROM Ticket WHERE id = ?";
       PreparedStatement stm = conn.prepareStatement(sql);
       stm.setInt (1,t.getId());
    }
}
