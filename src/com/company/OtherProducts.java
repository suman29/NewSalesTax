package com.company;

public class OtherProducts implements Products {
    private String name;
    private double price;
    private boolean isImported;

    @Override
    public void setProductDetails(String name, double price, boolean isImported) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
    }

    @Override
    public double salesTax() {
        return priceOnApplyingTax()-price;
    }

    @Override
    public double priceOnApplyingTax() {
        double tax = price;
        tax+=0.10*tax;
        if(isImported)
            return (tax+=0.05*tax);
        return tax;
    }
}
