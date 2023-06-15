/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Skyynemo
 */
public class Product implements Serializable {
        private Integer ProductID;
        private String ProductName;
        private Integer ProductPrice;
        
public Product(){
    
}

    public Product(Integer ProductID, String ProductName, Integer ProductPrice) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
    }

    public Integer getProductID() {
        return ProductID;
    }

    public void setProductID(Integer ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public Integer getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Integer ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    

    
}
