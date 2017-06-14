package com.example.us50416.poschecker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by us50416 on 6/13/17.
 */
public class ProductTest {

    @Test
    public void testProductExists() {
        Product breadBowl = new Product("anySku", 1.99);

        assertTrue(breadBowl != null);
    }

    @Test
    public void testProductHasPrice() {
        double expectedPrice = 1.99;
        Product redBull = new Product("redbull", expectedPrice);
        assertTrue(redBull.getPrice() == expectedPrice);
    }

    @Test
    public void testHasSku(){
        String expectedSku = "Bread Bowl";
        Product product = new Product(expectedSku, 1.99);
        assertTrue(product.getSku().equals(expectedSku));
    }

}