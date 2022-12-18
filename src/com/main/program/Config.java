/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anonim
 */
public class Config {
    
    private static Connection MSQLConfig;
    
    public static Connection configDB()throws SQLException {
        try {
            String url  = "jdbc:mysql://127.0.0.1:3306/project_sd_music";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MSQLConfig = DriverManager.getConnection(url, user, pass);
            
            System.out.println("db : " + MSQLConfig);

        } catch (SQLException e) {
            System.out.println("koneksi database gagal! \n" + e.getMessage());
        }
        return MSQLConfig;
    }
}
