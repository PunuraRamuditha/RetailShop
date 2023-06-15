/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Skyynemo
 */
public class Bill {
    private Integer BillID;
    private Integer CustomerID;
    private Integer CashierID;
    private Integer Amount;
    
public Bill(){}

    public Bill(Integer BillID, Integer CustomerID, Integer CashierID, Integer Amount) {
        this.BillID = BillID;
        this.CustomerID = CustomerID;
        this.CashierID = CashierID;
        this.Amount = Amount;
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

    public Integer getCashierID() {
        return CashierID;
    }

    public void setCashierID(Integer CashierID) {
        this.CashierID = CashierID;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

   
    
    

}
