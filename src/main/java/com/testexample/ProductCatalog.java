package com.testexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductCatalog {
    private List<Product> productList = new LinkedList<>();

    public ProductCatalog() {

    }

    public double priceUsd(String sku) {
       for (Product p : productList) {
           if(p.getProductId() == sku) {
               return p.getUsaPrice();
           }

       }
        return 0.0;
    }

    public void addProduct(Product p) {
        productList.add(p);
    }
    public int  getProductCount() {
        return productList.size();
    }

    public List<Product> getProductList() {
        return productList;
    }
}