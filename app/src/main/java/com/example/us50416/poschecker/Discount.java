package com.example.us50416.poschecker;

/**
 * Created by us50416 on 6/13/17.
 */

public class Discount {
    private int qualifier;
    private double percentage;
    private int compQuantity;

    public Discount(int q, double p, int c){
        qualifier = q;
        percentage = p;
        compQuantity = c;
    }

    public int getQualifier() {
        return qualifier;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getCompQuantity() {
        return compQuantity;
    }

    public double calcSaleUnitPrice(int quantity, double regularUnitPrice){
        if (quantity <= 0) return 0.0;
        double totalPrice = quantity*regularUnitPrice - compQuantity*percentage*regularUnitPrice;
        return totalPrice/quantity;
    }
}
