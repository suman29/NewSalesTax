package com.company;

public interface Products {
    void setProductDetails(String name, double price, boolean isImported);
    double salesTax();
    double priceOnApplyingTax();
}
