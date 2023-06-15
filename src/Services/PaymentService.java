/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DatabaseConnection.DbConnect;
import Model.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Skyynemo
 */
public class PaymentService {
    DbConnect connection=DbConnect.getInstance();
    public int insert(Payment c)
        throws ClassNotFoundException,SQLException {

        Connection conn = connection.getConnection();
        String query = "insert into payment(CustomerID,BillID,Amount) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, c.getCustomerID());
        ps.setInt(2, c.getBillID());
        ps.setInt(3, c.getAmount());
        int n = ps.executeUpdate();
        
        return n;
    
    
    
}
    
}
