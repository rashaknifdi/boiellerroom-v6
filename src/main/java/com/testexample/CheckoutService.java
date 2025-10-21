package com.testexample;

import java.util.LinkedList;
import java.util.List;

public class CheckoutService implements ExchangeRateClient {

    @Override
    public double getRate(String usd, String SEK) {
        return 9.43;
    }

    double calculateTotalPrice(List<Product> products) {

        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getUsaPrice();
        }
        return totalPrice;


    }
    public void exchangeRateToSek() {

    }


}
