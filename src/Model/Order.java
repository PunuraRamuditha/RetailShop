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
public class Order implements Serializable{
        private Integer OrderID;
        private Integer ProductID;
        private Integer NoOfProducts;
        private Integer BillID;

 public Order(){
    
}   

    public Order(Integer OrderID, Integer ProductID, Integer NoOfProducts, Integer BillID) {
        this.OrderID = OrderID;
        this.ProductID = ProductID;
        this.NoOfProducts = NoOfProducts;
        this.BillID = BillID;
    }

    public Integer getOrderID() {
        return OrderID;
    }

    public void setOrderID(Integer OrderID) {
        this.OrderID = OrderID;
    }

    public Integer getProductID() {
        return ProductID;
    }

    public void setProductID(Integer ProductID) {
        this.ProductID = ProductID;
    }

    public Integer getNoOfProducts() {
        return NoOfProducts;
    }

    public void setNoOfProducts(Integer NoOfProducts) {
        this.NoOfProducts = NoOfProducts;
    }

    public Integer getBillID() {
        return BillID;
    }

    public void setBillID(Integer BillID) {
        this.BillID = BillID;
    }
        
        
}
