package com.example.us50416.poschecker;

/**
 * Created by us50416 on 6/13/17.
 */

public class Product {

    private double price;
    private String sku;
    
    
    public Product(String sku, double price){
        this.price = price;
        this.sku = sku;
    }
    
    public double  getPrice() {
        return price;
    }

    public String getSku() {
        return sku;
    }
}
