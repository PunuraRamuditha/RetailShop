/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DatabaseConnection.DbConnect;
import Model.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Skyynemo
 */
public class OrderService {
    DbConnect connection=DbConnect.getInstance();
    public int insert(Order c)
        throws ClassNotFoundException,SQLException {

        Connection conn = connection.getConnection();
        String query = "insert into order_details(ProductID,NumberofProducts,BillID) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, c.getProductID());
        ps.setInt(2, c.getNoOfProducts());
        ps.setInt(3, c.getBillID());
        int n = ps.executeUpdate();
        
        return n;
    
    
    
}
    
    
    
}
