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

    

    public Double getBill() {
        return bill;
    }

    public void setBill(Double bill) {
        this.bill = bill;
    }

  
   
    
}
