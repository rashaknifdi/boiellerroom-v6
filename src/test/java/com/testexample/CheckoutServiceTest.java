package com.testexample ;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import com.testexample.CheckoutService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CheckoutServiceTest {

   @Test
    void shouldCalculateTotalPriceInUsd() {
       ProductCatalog productCatalog = new ProductCatalog();
       Product p1 = new Product("p1", 100.0);
       productCatalog.addProduct(p1);
       Product p2 = new Product("p2", 200.0);
       productCatalog.addProduct(p2);
       Product p3 = new Product("p3", 300.0);
       productCatalog.addProduct(p3);
       CheckoutService checkoutService = new CheckoutService();
       double totalUsd = checkoutService.calculateTotalPrice(productCatalog.getProductList());
       assertEquals(600,totalUsd);
    }

    @Test
    void takeTotalSumOfUsd_AndConvertToSek() {
        ExchangeRateClient mockExchangeRateClient = Mockito.mock(ExchangeRateClient.class);
        ProductCatalog productCatalog = new ProductCatalog();
        Product p1 = new Product("p1", 100.0);
        productCatalog.addProduct(p1);
        Product p2 = new Product("p2", 200.0);
        productCatalog.addProduct(p2);
        Product p3 = new Product("p3", 300.0);
        productCatalog.addProduct(p3);
        CheckoutService checkoutService = new CheckoutService();
        when(mockExchangeRateClient.getRate("USD", "SEK")).thenReturn(9.43);
        double totalUsd = checkoutService.calculateTotalPrice(productCatalog.getProductList());
        double convertedToSek= mockExchangeRateClient.getRate("USD", "SEK");
        double totalSek = totalUsd * convertedToSek;
        assertEquals(5658,totalSek);


    }


}
