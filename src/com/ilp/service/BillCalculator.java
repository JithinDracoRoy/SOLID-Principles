package com.ilp.service;

import com.ilp.entity.Bill;

public class BillCalculator {
    public double calculateTotal(Bill bill) {
       
        return bill.getSubtotal() + 1000.0;
    }
    public void addTocart() {
    	System.out.println("Product added to the cart");
    }
    public void removeFromCart() {
    	System.out.println("Product removed from the cart");
    }
}
