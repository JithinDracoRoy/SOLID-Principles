package com.ilp.services;

import com.ilp.entity.Order;

public class Payment {
    public void processPayment(Order order) {
        // Placeholder logic for processing payment, e.g., interacting with a payment gateway.
        System.out.println("Payment processed successfully for order total amount: $" + order.getTotalAmount());
    }
}
