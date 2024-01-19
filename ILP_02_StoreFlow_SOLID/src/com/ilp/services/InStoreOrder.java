package com.ilp.services;

import java.util.List;

import com.ilp.entity.Watch;
import com.ilp.interfaces.Order;

public class InStoreOrder implements Order {
	private List<Watch> watchs;

	public InStoreOrder(List<Watch> watchs) {
		this.watchs = watchs;
	}

	@Override
	public List<Watch> getProducts() {
		return watchs;
	}

	@Override
	public double calculateTotalAmount() {
		return watchs.stream().mapToDouble(Watch::getPrice).sum();
	}

	@Override
	public void processOrder() {
		System.out.println("In-store order processed successfully.");
	}
}