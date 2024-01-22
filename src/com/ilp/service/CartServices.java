package com.ilp.service;

import com.ilp.entity.Cart;
import com.ilp.entity.Product;

public class CartServices {
    public static void addToCart(Cart cart, Product product) {
        System.out.println("Product added to the cart");
        cart.getProducts().add(product);
    }

    public static void removeFromCart(Cart cart, Product product) {
        System.out.println("Product removed from the cart");
        cart.getProducts().remove(product);
    }

    public static void viewCart(Cart cart) {
        System.out.println("Cart viewed");
        for (Product product : cart.getProducts()) {
            System.out.println("Product: " + product.getProductName() + ", Price: " + product.getProductPrice());
        }
    }
   
}
