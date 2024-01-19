package com.ilp.services;

import com.ilp.entity.Order;
import com.ilp.entity.Watch;

public class RolexStore {
	private Cart cart;
	private Payment payment;

	public RolexStore(Cart cart, Payment payment) {
		this.cart = cart;
		this.payment = payment;
	}

	public void addItemToCart(Watch product) {
		cart.addProduct(product);
	}

	public void removeItemFromCart(Watch product) {
		cart.removeProduct(product);
	}

	public void viewCart() {
		System.out.println("Items in the cart:");
		for (Watch product : cart.getProducts()) {
			System.out.println(product.getName() + " - $" + product.getPrice());
		}
		System.out.println("Total amount: $" + cart.calculateTotalAmount());
	}

	public void checkout() {
		if (!cart.getProducts().isEmpty()) {
			Order order = new Order(cart.getProducts());
			payment.processPayment(order);
			order.processOrder();
		} else {
			System.out.println("The cart is empty. Add items before checking out.");
		}
	}
}
