/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.services;

import com.haoquy.pojo.Seat;
import com.haoquy.pojo.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HaoQuy
 */
public class Buy {
     public static void BuyTicket(Ticket t,int idSeat) throws SQLException { 
       Connection conn = Utils.getConn();
       String sql = "INSERT INTO Ticket(bus, price,time,date,customer) "
                    + "VALUES(?, ?, ?,?,?,?)";
       PreparedStatement stm = conn.prepareStatement(sql);
       stm.setString (1,t.getBs().getId());
       stm.setInt(2,t.getPrice());
       stm.setString(3, t.getTime());
       stm.setString(4, t.getDate());
       stm.setString(5, t.getCs().getName());
       stm.executeUpdate();
       sql = "UPDATE Seat SET Status = PLACED WHERE id = ?";
       stm = conn.prepareStatement(sql);
       stm.setInt(1,idSeat);
       stm.executeUpdate();
    }
}
