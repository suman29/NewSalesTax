package com.company;

public class Book implements Products {
    private double price;
    private String name;
    private boolean isImported;

    @Override
    public void setProductDetails(String name, double price, boolean isImported) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
    }

    @Override
    public double salesTax() {
        return 0;
    }

    @Override
    public double priceOnApplyingTax() {
        return price;
    }
}
