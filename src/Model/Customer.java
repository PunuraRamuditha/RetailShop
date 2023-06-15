/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nooby
 */
public class Customer {
    private Integer CustomerID;
    private String CustomerName;
    private String CustomerEmail;
    private Integer CustomerContact;
    
    public Customer(){}

    public Customer(Integer CustomerID, String CustomerName, String CustomerEmail, Integer CustomerContact) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerEmail = CustomerEmail;
        this.CustomerContact = CustomerContact;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    public Integer getCustomerContact() {
        return CustomerContact;
    }

    public void setCustomerContact(Integer CustomerContact) {
        this.CustomerContact = CustomerContact;
    }
    
    
   

    
}