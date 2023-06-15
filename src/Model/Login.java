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
public class Login implements Serializable{
    
    private String Username;
    private Integer Password;
    
public Login(){
    
}

    public Login(String Username, Integer Password) {
        this.Username = Username;
        this.Password = Password;
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
