package com.ilp.service;

import com.ilp.interfaces.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    public void processPayment(double totalAmount) {
        System.out.println("Payment of $" + totalAmount + " made using Credit Card");
    }
}
