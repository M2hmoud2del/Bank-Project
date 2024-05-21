/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankApp;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ezzat
 */
public class Payments implements Serializable {
    
    private String  date,refrence,description;
    private String cardnum;
    private Double bill;
    Payments(){};

    public Payments(String date, String refrence, String description, String cardnum, Double bill) {
        this.date = date;
        this.refrence = refrence;
        this.description = description;
        this.cardnum = cardnum;
        this.bill = bill;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRefrence() {
        return refrence;
    }

    public void setRefrence(String refrence) {
        this.refrence = refrence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public Double getBill() {
        return bill;
    }

    public void setBill(Double bill) {
        this.bill = bill;
    }

    

    

  
   
    
}
