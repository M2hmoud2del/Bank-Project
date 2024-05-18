/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankApp;

import java.io.Serializable;

/**
 *
 * @author Abdelrahman
 */
public class User implements Serializable {
    private String username, pass, id;
    private boolean is_admin;

    public User(String username, String pass, String id, boolean is_admin) {
        this.username = username;
        this.pass = pass;
        this.id = id;
        this.is_admin = is_admin;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", pass=" + pass + ", id=" + id + '}';
    }

    
}
