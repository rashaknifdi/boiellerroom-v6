package com.testexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductCatalog {
    private List<Product> productList = new LinkedList<>();

    public ProductCatalog() {
        productList.add(new Product("id", 30));
    }

    public double priceUsd(String sku) {
       for (Product p : productList) {
           if(p.getProductId() == sku) {
               return p.getUsaPrice();
           }

       }
        return 0.0;
    }

    public void addProduct(Product p) {}
}