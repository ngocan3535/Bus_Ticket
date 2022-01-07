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
public class Change {
     public static void BuyTicket(Ticket t,int idSeatNew) throws SQLException { 
       Connection conn = Utils.getConn();
       String sql = "UPDATE Bus  SET Bus = ?, Price =? ,Time=?,Date =? WHERE id = ?";
       PreparedStatement stm = conn.prepareStatement(sql);
       stm.setString (1,t.getBs().getId());
       stm.setInt(2,t.getPrice());
       stm.setString(3, t.getTime());
       stm.setString(4, t.getDate());
       stm.setString(5, t.getCs().getName());
       stm.setInt(6,t.getId());
       stm.executeUpdate();
       sql = "UPDATE Seat SET Status = PLACED WHERE id = ?";
       stm = conn.prepareStatement(sql);
       stm.setInt(1,idSeatNew);
       stm.executeUpdate();
        sql = "UPDATE Seat SET Status = EMPTY WHERE id = ?";
       stm = conn.prepareStatement(sql);
       stm.setInt(1,t.getSt().getId());
       stm.executeUpdate();
       t.getSt().setId(idSeatNew);
    }
}
