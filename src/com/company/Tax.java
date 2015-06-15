package com.company;

public class Tax {

    public double totalTax(Products product) {
        return product.priceOnApplyingTax();
    }

    public double salesTax(Products product) {
        return product.salesTax();
    }
}
