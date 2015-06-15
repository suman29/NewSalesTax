package com.company;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class OtherProductsTest {
    @Test
    public void shouldBeAbleToSetDetailsOfOtherProducts() {
        OtherProducts otherProducts = new OtherProducts();
        otherProducts.setProductDetails("CD", 12, false);

        double actualOutput = otherProducts.priceOnApplyingTax();
        double expectedOutput = 12;

        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldCalculateTotalTaxOfOtherProducts() {
        OtherProducts otherProducts = new OtherProducts();
        otherProducts.setProductDetails("CD", 12, false);

        double actualOutput = otherProducts.priceOnApplyingTax();
        double expectedOutput = 13.2;

        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldCalculateSalesTaxOfOtherProduct() {
        OtherProducts otherProducts = new OtherProducts();
        otherProducts.setProductDetails("CD", 12, false);

        double actualOutput = otherProducts.salesTax();
        double expectedOutput = 1.2;

        assertEquals(actualOutput, expectedOutput, 0.05d);
    }

    @Test
    public void shouldRepresentTheDetailsOfBookInProperFormat() {
        OtherProducts otherProducts = new OtherProducts();
        otherProducts.setProductDetails("CD", 12, false);

        String actualString = otherProducts.toString();
        String expectedString = "1 CD:12.0";

        assertEquals(actualString,expectedString);
    }
}