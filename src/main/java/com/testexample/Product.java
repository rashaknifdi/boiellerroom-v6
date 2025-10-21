package com.testexample;

public class Product {
    String productId;
    double usaPrice;

    public Product(String productId, double usaPrice) {
        this.productId = productId;
        this.usaPrice = usaPrice;
    }

    public String getProductId() {
        return productId;
    }

    public double getUsaPrice() {
        return usaPrice;
    }
}
