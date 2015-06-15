package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxTest {

    @Test
    public void shouldCalculateTaxOFTheGivenProduct() {
        Tax tax = new Tax();
        Products product = new Book();
        product.setProductDetails("Book", 10, false);

        double actualTax = tax.calculateTotalTax(product);
        double expectedTax = 10.0;

        assertEquals(expectedTax, actualTax, 0.05d);
    }
}