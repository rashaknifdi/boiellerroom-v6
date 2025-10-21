package com.testexample ;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCatalogTest {
    @Test
    void shouldReturnCorrectPriceForProduct() {
        ProductCatalog productCatalog = new ProductCatalog();
        Product p1 = new Product("p1", 100.0);
        productCatalog.addProduct(p1);
        double price = productCatalog.priceUsd("p1");
        assertEquals(100.0,price);

    }
    @Test
    void addProduct() {

    }

}
