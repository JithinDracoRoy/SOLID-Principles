package com.ilp.service;

import com.ilp.entity.Payment;

public class OnlinePayment extends Payment {
	public void makePayment(double totalAmount, String paymentMethod) {
		System.out.println("Online Payment is chosen");
        System.out.println("Online payment of $" + totalAmount + " made using " + paymentMethod);
       
    }
}
