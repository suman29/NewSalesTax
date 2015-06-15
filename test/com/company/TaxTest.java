package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxTest {

    @Test
    public void shouldCalculateTaxOFTheGivenProduct() {
        Tax tax = new Tax();
        Products product = new Book();
        product.setProductDetails("Book", 10, false);

        double actualTax = tax.totalTax(product);
        double expectedTax = 10.0;

        assertEquals(expectedTax, actualTax, 0.05d);
    }

    @Test
    public void shouldCalculateSalesTaxOFTheGivenProduct() {
        Tax tax = new Tax();
        Products product = new Book();
        product.setProductDetails("Book", 10, true);

        double actualTax = tax.salesTax(product);
        double expectedTax = 0.5;

        assertEquals(expectedTax, actualTax, 0.05d);
    }
}