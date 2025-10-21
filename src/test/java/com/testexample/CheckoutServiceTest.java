package com.testexample ;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import com.testexample.CheckoutService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutServiceTest {

   @Test
    void shouldCalculateTotalPriceInUsd() {
       ExchangeRateClient exchangeRateClient = Mockito.mock(ExchangeRateClient.class);
       ProductCatalog productCatalog = new ProductCatalog();
       Product p1 = new Product("p1", 100.0);
       productCatalog.addProduct(p1);
       Product p2 = new Product("p2", 200.0);
       productCatalog.addProduct(p2);
       Product p3 = new Product("p3", 300.0);
       productCatalog.addProduct(p3);

       CheckoutService checkoutService = new CheckoutService();
       double totalUsd = checkoutService.calculateTotalPrice();
       assertEquals(600,totalUsd);
    }

    @Test
    void takeTotalSumOfUsd_AndConvertToSek() {


    }


}
