package com.ilp.interfaces;

public interface BillingOperations {
	 double calculateSubtotal();
	    double calculateTotal(double subtotal);
	    void generateBillDetails();
}
