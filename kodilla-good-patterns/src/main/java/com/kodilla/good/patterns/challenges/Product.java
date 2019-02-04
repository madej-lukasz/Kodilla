package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;
    private  String productId;


    public Product(String productName, String productId) {
        this.productName = productName;
        this.productId = productId;

    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }


}
