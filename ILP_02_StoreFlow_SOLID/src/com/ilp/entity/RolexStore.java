package com.ilp.entity;

import java.util.List;

import com.ilp.interfaces.CartOperations;
import com.ilp.interfaces.Order;
import com.ilp.interfaces.Payment;
import com.ilp.interfaces.StoreOperations;

public class RolexStore implements StoreOperations {
	private CartOperations cart;
	private Payment payment;

	public RolexStore(CartOperations cart, Payment payment) {
		this.cart = cart;
		this.payment = payment;
	}

	// Implement the methods from StoreOperations interface
	@Override
	public void addItemToCart(Watch watch) {
		cart.addProduct(watch);
	}

	@Override
	public void removeItemFromCart(Watch watch) {
		cart.removeProduct(watch);
	}

	@Override
	public void viewCart() {
		System.out.println("Items in the cart:");
		for (Watch watch : cart.getProducts()) {
			System.out.println(watch.getName() + " - $" + watch.getPrice());
		}
		System.out.println("Total amount: $" + cart.calculateTotalAmount());
	}

	@Override
	public void checkout(Order order) {
		payment.processPayment(order);
		order.processOrder();
	}

	@Override
	public List<Watch> getProducts() {
		return cart.getProducts();
	}
}
