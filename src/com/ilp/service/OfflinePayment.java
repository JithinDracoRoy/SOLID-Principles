package com.ilp.service;

import com.ilp.entity.Payment;

public class OfflinePayment extends Payment {
	public void makePayment(double totalAmount, String paymentMethod) {
        System.out.println("Offline payment of $" + totalAmount + " made using " + paymentMethod);
    }
	
}
