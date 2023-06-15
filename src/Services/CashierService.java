/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DatabaseConnection.DbConnect;
import Model.Cashier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Skyynemo
 */
public class CashierService {
    
    DbConnect connection=DbConnect.getInstance();
    public int insert(Cashier c)
        throws ClassNotFoundException,SQLException {

        Connection conn = connection.getConnection();
        String query = "insert into cashier_details(CashierName,CashierContact,CashierEmail,Username,Password) values (?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, c.getCashierName());
        ps.setInt(2, c.getCashierContact());
        ps.setString(3, c.getCashierEmail());
        ps.setString(4, c.getUsername());
        ps.setInt(5, c.getPassword());
        int n = ps.executeUpdate();
        
        return n;
    }
    public Cashier verify(String Username,Integer Password)throws SQLException,ClassNotFoundException{
        Connection conn = connection.getConnection();
        Statement stmt = conn.createStatement();
        boolean check = false;
        Cashier cashier = new Cashier();
        String sql = "select * from cashier_details where Username='"+Username+"' and Password='"+Password+"'";
        ResultSet rs = stmt.executeQuery(sql);
         while(rs.next()){
                check = true;
                cashier.setCashierId(rs.getInt("CashierID"));
    }
   if(check == true){
            return cashier;
        }
        else{
            return null;
        }
    }
    
     public Cashier getCashier(int Cid)throws SQLException,ClassNotFoundException{
        Connection conn = connection.getConnection();
         String sql = "select * from cashier_details where CashierID =  "+Cid+" ";
        PreparedStatement ps = conn.prepareStatement(sql);
     
        Cashier cashier = new Cashier();
        ResultSet rs = ps.executeQuery(sql);
        boolean check = false;
         while(rs.next()){
                check = true;
                cashier.setCashierId(rs.getInt("CashierID"));
                cashier.setCashierName(rs.getString("CashierName"));
                cashier.setCashierContact(rs.getInt("CashierContact"));
                cashier.setCashierEmail(rs.getString("CashierEmail"));
                cashier.setUsername(rs.getString("Username"));
                cashier.setPassword(rs.getInt("Password"));
    }
   if(check == true){
            return cashier;
        }
        else{
            return null;
        }
    }
}