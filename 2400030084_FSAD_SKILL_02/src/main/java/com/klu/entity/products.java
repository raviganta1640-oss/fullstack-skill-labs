package com.klu.entity;

import javax.persistence.*;

@Entity
@Table(name = "products2")
public class products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    private String pname;
    private int quantity;
    private double price;

    // Required default constructor
    public products() {
    }

    
    public products(String pname, int quantity, double price) {
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "products [pid=" + pid + ", pname=" + pname +
                ", quantity=" + quantity + ", price=" + price + "]";
    }
}