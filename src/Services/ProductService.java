/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DatabaseConnection.DbConnect;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Skyynemo
 */
public class ProductService {
    DbConnect connection=DbConnect.getInstance();
    public int insert(Product c)
        throws ClassNotFoundException,SQLException {

        Connection conn = connection.getConnection();
        String query = "insert into product_details(ProductName,ProductPrice) values (?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, c.getProductName());
        ps.setInt(2, c.getProductPrice());
        int n = ps.executeUpdate();
        
        return n;
    
    
    
}
    
    public Product getProduct(int icode) throws SQLException, ClassNotFoundException{
        String query = "select * from product_details where ProductID = ?";
        Connection conn = connection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, icode);
        Product items = new Product();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        
        while (rs.next()) {            
            check = true;
            items.setProductID(rs.getInt("ProductID"));
            items.setProductName(rs.getString("ProductName"));
            items.setProductPrice(rs.getInt("ProductPrice"));
            
        }
        
        if(check == true){
            return items;
        }
        else{
            return null;
        }
    }
    
}
