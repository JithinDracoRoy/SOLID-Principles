package com.ilp.interfaces;

import com.ilp.entity.Product;

public interface CartOperations {

		void addToCart(Product product);

		void removeFromCart(Product product);

		void viewCart();
}
