/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Skyynemo
 */
public class DbConnect {
    public static DbConnect jdbc;
    
    public DbConnect(){}
    
    public static DbConnect getInstance(){
        if (jdbc==null)
        {
          jdbc = new DbConnect() {};  
        }
    return jdbc;
    }
    
    public Connection getConnection() throws ClassNotFoundException,SQLException{
        String url = "jdbc:mysql://localhost:3306/Punura_Super";
        String user = "root";
        String password = "";
        Connection conn = null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,password);
        }
        catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    return conn;
    }
}
