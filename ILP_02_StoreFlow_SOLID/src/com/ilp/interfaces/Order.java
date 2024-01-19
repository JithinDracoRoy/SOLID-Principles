package com.ilp.interfaces;

import java.util.List;

import com.ilp.entity.Watch;

public interface Order {

	List<Watch> getProducts();

	double calculateTotalAmount();

	void processOrder();

}
