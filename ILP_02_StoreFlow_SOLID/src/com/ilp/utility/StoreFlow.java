package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Watch;
import com.ilp.entity.Cart;
import com.ilp.entity.RolexStore;
import com.ilp.interfaces.Order;
import com.ilp.interfaces.Payment;
import com.ilp.interfaces.StoreOperations;
import com.ilp.services.CreditCardPayment;
import com.ilp.services.InStoreOrder;
import com.ilp.services.OnlineOrder;

public class StoreFlow {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create products
        Watch gmt_master = new Watch("GMT-Master", 3200000.00);
		Watch submariner = new Watch("Submariner", 900000.00);
		Watch datejust = new Watch("Datejust", 1500000.00);

        // Create shopping cart and payment processor
        Cart cart = new Cart();
        Payment payment = new CreditCardPayment();

        // Create store
        StoreOperations store = new RolexStore(cart, payment);
        scanner.nextLine();

        // Add items to the cart
        store.addItemToCart(gmt_master);
        store.addItemToCart(submariner);
        store.addItemToCart(datejust);
        scanner.nextLine();

        // View the cart
        store.viewCart();
        scanner.nextLine();

        // Checkout an online order
        Order onlineOrder = new OnlineOrder(store.getProducts());
        store.checkout(onlineOrder);
        scanner.nextLine();

        // Add more items to the cart
        store.addItemToCart(new Watch("Oyster", 1300000.00));
        store.addItemToCart(new Watch("Deepsea", 2100000.00));
        scanner.nextLine();

        // View the updated cart
        store.viewCart();
        scanner.nextLine();

        // Checkout an in-store order
        Order inStoreOrder = new InStoreOrder(store.getProducts());
        store.checkout(inStoreOrder);
    }
}
