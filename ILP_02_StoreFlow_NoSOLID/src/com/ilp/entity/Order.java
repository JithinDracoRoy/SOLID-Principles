package com.ilp.entity;

import java.util.List;

public class Order {
    private List<Watch> products;
    private double totalAmount;

    public Order(List<Watch> products) {
        this.products = products;
        this.totalAmount = calculateTotalAmount();
    }

    public List<Watch> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private double calculateTotalAmount() {
        return products.stream().mapToDouble(Watch::getPrice).sum();
    }

    public void processOrder() {
        // Placeholder logic for processing the order, e.g., updating inventory, sending confirmation, etc.
        System.out.println("Order processed successfully.");
    }
}
