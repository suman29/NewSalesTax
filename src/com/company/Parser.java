package com.company;

import java.util.HashMap;

public class Parser {
    private HashMap<String, Products> mappedProducts;

    public Parser(HashMap<String, Products> mappedProducts) {
       this.mappedProducts = mappedProducts;
    }

    public Products getProduct(String userInput) {

        Products product = null;
        String input[] = userInput.split(" ");
        String productName;
        double price;
        boolean isImported;

        if (input.length == 4) {
            product = productWhenLengthOfInputIsFour(input);
        }

        if (input.length == 5) {
            product = productWhenLengthOfInputIsFive(input);
        }

        if (input.length == 6) {
            product = productWhenLengthOfInputIsSix(input);

        }

        if(input.length == 7) {
            product = productWhenLengthOfInputIsSeven(input);
        }

        return product;
    }

    private Products productWhenLengthOfInputIsSeven(String[] input) {
        Products product;
        String productName;
        double price;
        boolean isImported;
        product = mappedProducts.get(input[3]);
        productName = input[4];
        price = Float.parseFloat(input[6]);
        isImported = true;

        product.setProductDetails(productName,price,isImported);
        return product;
    }

    private Products productWhenLengthOfInputIsSix(String[] input) {
        Products product;
        String productName;
        double price;
        boolean isImported;
        product = mappedProducts.get(input[3]);
        productName = input[3];
        price = Float.parseFloat(input[5]);
        isImported = false;

        product.setProductDetails(productName,price,isImported);
        return product;
    }

    private Products productWhenLengthOfInputIsFive(String[] input) {
        Products product;
        String productName;
        double price;
        boolean isImported;
        product = mappedProducts.get(input[2]);
        productName =input[2];
        price = Float.parseFloat(input[4]);
        isImported = true;

        product.setProductDetails(productName,price,isImported);
        return product;
    }

    private Products productWhenLengthOfInputIsFour(String[] input) {
        Products product;
        String productName;
        double price;
        boolean isImported;
        product = mappedProducts.get(input[1]);
        productName =input[1];
        price = Float.parseFloat(input[3]);
        isImported = false;

        product.setProductDetails(productName,price,isImported);
        return product;
    }
}
