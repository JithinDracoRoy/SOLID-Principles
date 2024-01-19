package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Watch;
import com.ilp.services.Payment;
import com.ilp.services.Cart;
import com.ilp.services.RolexStore;

public class StoreFlow {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create a few products
		Watch gmt_master = new Watch("GMT-Master", 3200000.00);
		Watch submariner = new Watch("Submariner", 900000.00);
		Watch datejust = new Watch("Datejust", 1500000.00);

		// Create a shopping cart and a payment processor
		Cart cart = new Cart();
		Payment payment = new Payment();

		// Create a store with the shopping cart and payment processor
		RolexStore rolexStore = new RolexStore(cart, payment);
		scanner.nextLine();

		// Add items to the cart
		rolexStore.addItemToCart(gmt_master);
		rolexStore.addItemToCart(submariner);
		rolexStore.addItemToCart(datejust);
		scanner.nextLine();

		// View the items in the cart
		rolexStore.viewCart();
		scanner.nextLine();

		// Remove an item from the cart
		rolexStore.removeItemFromCart(submariner);
		scanner.nextLine();

		// View the updated cart
		rolexStore.viewCart();
		scanner.nextLine();

		// Checkout
		rolexStore.checkout();
	}

}
