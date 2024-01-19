package com.ilp.entity;

import java.util.ArrayList;
import java.util.List;

import com.ilp.interfaces.CartOperations;

public class Cart implements CartOperations{
	private List<Watch> watchs;

	public Cart() {
		this.watchs = new ArrayList<>();
	}
	
	public List<Watch> getProducts() {
		return new ArrayList<>(watchs);
	}

	@Override
	public void addProduct(Watch watch) {
		watchs.add(watch);
		System.out.println(watch.getName() + " added to the shopping cart.");
	}

	@Override
	public void removeProduct(Watch watch) {
		if (watchs.remove(watch)) {
			System.out.println(watch.getName() + " removed from the shopping cart.");
		} else {
			System.out.println(watch.getName() + " not found in the shopping cart.");
		}
	}

	public double calculateTotalAmount() {
		return watchs.stream().mapToDouble(Watch::getPrice).sum();
	}

}
