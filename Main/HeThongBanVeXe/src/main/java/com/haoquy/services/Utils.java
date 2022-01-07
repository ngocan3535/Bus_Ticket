package com.haoquy.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HaoQuy
 */
public class Utils {
    private static Connection conn;
    static 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/salesticket";  
                String name="root";  
                String pass="123456";  
                conn = DriverManager.getConnection(url,name,pass);  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getConn() {
        return conn;
    }
}
