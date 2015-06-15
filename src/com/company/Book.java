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
        return (priceOnApplyingTax() - price);
    }

    @Override
    public double priceOnApplyingTax() {
        double tax =price;
        if(isImported)
            return (tax+=0.05*tax);
        return tax;
    }

    @Override
    public String toString() {
        if(isImported)
            return ("1 imported "+name+":"+price);
        else
            return ("1 "+name+":"+price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (isImported != book.isImported) return false;
        return !(name != null ? !name.equals(book.name) : book.name != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isImported ? 1 : 0);
        return result;
    }
}
