package com.testexample;

import java.util.LinkedList;
import java.util.List;

public class CheckoutService implements ExchangeRateClient {

    @Override
    public double getRate(String usd, String SEK) {
        return 9.43;
    }
    private List<Product> products = new LinkedList();

    double calculateTotalPrice() {
        double totalPrice = products.stream().su
                ;


    }
    public void exchangeRateToSek() {

    }

    public List<Product> getProducts() {
        return products;
    }
}
