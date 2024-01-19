package com.ilp.services;

import java.util.ArrayList;
import java.util.List;

import com.ilp.entity.Watch;

public class Cart {
    private List<Watch> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Watch product) {
        products.add(product);
        System.out.println(product.getName() + " added to the shopping cart.");
    }

    public void removeProduct(Watch product) {
        if (products.remove(product)) {
            System.out.println(product.getName() + " removed from the shopping cart.");
        } else {
            System.out.println(product.getName() + " not found in the shopping cart.");
        }
    }

    public List<Watch> getProducts() {
        return new ArrayList<>(products); // Return a copy to avoid external modification of the cart
    }

    public double calculateTotalAmount() {
        return products.stream().mapToDouble(Watch::getPrice).sum();
    }

}
