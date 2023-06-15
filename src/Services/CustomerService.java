/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DatabaseConnection.DbConnect;
import Model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Skyynemo
 */
public class CustomerService {
     DbConnect connection=DbConnect.getInstance();
    public int insert(Customer c)
        throws ClassNotFoundException,SQLException {

        Connection conn = connection.getConnection();
        String query = "insert into customer_details(CustomerName,CustomerContact,CustomerEmail) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, c.getCustomerName());
        ps.setInt(2, c.getCustomerContact());
        ps.setString(3, c.getCustomerEmail());
        int n = ps.executeUpdate();
        
        return n;
    
    
    
}
}
