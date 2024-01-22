package com.ilp.service;

import com.ilp.entity.Product;
import com.ilp.interfaces.CartOperations;

import java.util.ArrayList;
import java.util.List;

public class CartServicesImpl implements CartOperations {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addToCart(Product product) {
        products.add(product);
        System.out.println("Product added to the cart");
    }

    @Override
    public void removeFromCart(Product product) {
        products.remove(product);
        System.out.println("Product removed from the cart");
    }

    @Override
    public void viewCart() {
        System.out.println("Cart viewed");
        for (Product product : products) {
            System.out.println("Product: " + product.getProductName() + ", Price: " + product.getProductPrice());
        }
    }
}
