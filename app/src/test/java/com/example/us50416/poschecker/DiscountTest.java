package com.example.us50416.poschecker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by us50416 on 6/13/17.
 */
public class DiscountTest {

    @Test
    public void testDiscountObjectExists(){
        Discount discount = new Discount(5, .50, 0);
        assertTrue(discount != null);

    }

    @Test
    public void testDiscountHasQualifier(){
        int expectedQualifier = 4;
        double expectedPercentage = 0.50;
        int expectedCompQuantity = 2;
        Discount discount = new Discount(expectedQualifier, expectedPercentage, expectedCompQuantity);
        assertTrue(discount.getQualifier() == expectedQualifier);
        assertTrue(discount.getPercentage() == expectedPercentage);
        assertTrue(discount.getCompQuantity() == expectedCompQuantity);
    }

    @Test
    public void testPricePerEachWithBuyOneGetOneFree(){
        double expectedUnitPrice = 1.00;
        double inputPrice = 2.00;
        Discount discount = new Discount(1, 1.00, 1);
        assertEquals(expectedUnitPrice, discount.calcSaleUnitPrice(2, inputPrice), .001);
    }

    @Test
    public void testPricePerEachWithBuyOneGetOneHalfOff(){
        double expectedSalePrice = 1.50;
        double inputPrice = 2.00;
        Discount discount = new Discount(1, .5, 1);
        assertEquals(expectedSalePrice , discount.calcSaleUnitPrice(2, inputPrice), .001);
    }

    @Test
    public void testPriceDivByZeroException(){
        Discount discount = new Discount(1,1,1);
        assertEquals(discount.calcSaleUnitPrice(0,3), 0, .001);
    }


}