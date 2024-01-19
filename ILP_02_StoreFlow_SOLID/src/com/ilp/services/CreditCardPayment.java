package com.ilp.services;

import com.ilp.interfaces.Order;
import com.ilp.interfaces.Payment;

public class CreditCardPayment implements Payment {
	@Override
	public void processPayment(Order order) {
		System.out.println(
				"Credit card payment processed successfully for order total amount: $" + order.calculateTotalAmount());
	}
}