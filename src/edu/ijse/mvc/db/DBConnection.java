/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;

import 
import java.sql.SQLException;

/**
 *
 * @author chanika
 */
public class DBConnection {
  
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection(){
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "Chanika", "chanika0218");
    }
    
    public static DBConnection getInstance (){
        if(dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
    
    public connection 
}
