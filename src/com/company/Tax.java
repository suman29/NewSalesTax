package com.company;

public class Tax {

    public double calculateTotalTax(Products product) {
        return product.priceOnApplyingTax();
    }
}
