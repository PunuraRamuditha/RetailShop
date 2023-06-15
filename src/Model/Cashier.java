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
public class Cashier implements Serializable {
    private Integer CashierId;
    private String CashierName;
    private Integer CashierContact;
    private String CashierEmail;
    private String Username;
    private Integer Password;
    
    public Cashier() {}
    
    

    public Cashier(Integer CashierId, String CashierName, Integer CashierContact, String CashierEmail, String Username, Integer Password) {
        this.CashierId = CashierId;
        this.CashierName = CashierName;
        this.CashierContact = CashierContact;
        this.CashierEmail = CashierEmail;
        this.Username = Username;
        this.Password = Password;
    }
    
    
    public Integer getCashierId() {
        return CashierId;
    }

    public void setCashierId(Integer CashierId) {
        this.CashierId = CashierId;
    }

    public String getCashierName() {
        return CashierName;
    }

    public void setCashierName(String CashierName) {
        this.CashierName = CashierName;
    }

    public Integer getCashierContact() {
        return CashierContact;
    }

    public void setCashierContact(Integer CashierContact) {
        this.CashierContact = CashierContact;
    }
    
    public String getCashierEmail() {
        return CashierEmail;
    }

    public void setCashierEmail(String CashierEmail) {
        this.CashierEmail = CashierEmail;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
     public Integer getPassword() {
        return Password;
    }

    public void setPassword(Integer Password) {
        this.Password = Password;
    }
    
   
    
}
