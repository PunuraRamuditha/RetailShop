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
public class Payment implements Serializable{
    private Integer PaymentID;
    private Integer BillID;
    private Integer CustomerID;
    private Integer Amount;

    public Payment() {
    }
    
    

    public Payment(Integer PaymentID, Integer BillID, Integer CustomerID, Integer Amount) {
        this.PaymentID = PaymentID;
        this.BillID = BillID;
        this.CustomerID = CustomerID;
        this.Amount = Amount;
    }

    public Integer getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(Integer PaymentID) {
        this.PaymentID = PaymentID;
    }

    public Integer getBillID() {
        return BillID;
    }

    public void setBillID(Integer BillID) {
        this.BillID = BillID;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }
    
    
    
    
}
