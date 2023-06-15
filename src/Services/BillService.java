/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DatabaseConnection.DbConnect;
import Model.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Skyynemo
 */
public class BillService {
    DbConnect connection=DbConnect.getInstance();
    public int insert(Bill c)
        throws ClassNotFoundException,SQLException {

        Connection conn = connection.getConnection();
        String query = "insert into bills(CustomerID,CashierID,Amount) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query , PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setInt(1, c.getCustomerID());
        ps.setInt(2, c.getCashierID());
        ps.setInt(3, c.getAmount());
        int n = ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
               c.setBillID(rs.getInt(1));
            }
        
        return n;
    
    
    
}
}

