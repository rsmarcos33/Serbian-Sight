package com.service;

import com.exception.NotEnoughProductsInStockException;
import com.model.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {
    void addProduct(Product product);
    void removeProduct(Product product);
    Map<Product, Integer> getProductsInCart();
    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
