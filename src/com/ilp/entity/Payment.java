package com.ilp.entity;

import com.ilp.interfaces.PaymentOperations;
import com.ilp.interfaces.PaymentMethod;

public class Payment implements PaymentOperations {
    private PaymentMethod paymentMethod;

    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Payment() {

    }

    @Override
    public void makePayment(double totalAmount, String paymentMethod) {
        // Ensure paymentMethod is not null before calling processPayment
        if (this.paymentMethod != null) {
            this.paymentMethod.processPayment(totalAmount);
        } else {
            System.out.println("Error: Payment method not set.");
        }
    }
}


















//package com.ilp.entity;
//
//import com.ilp.interfaces.PaymentOperations;
//import com.ilp.interfaces.PaymentMethod;
//
//public class Payment implements PaymentOperations {
//    private PaymentMethod paymentMethod;
//
//    public Payment(PaymentMethod paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public Payment() {
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//    public void makePayment(double totalAmount, String paymentMethod) {
//        this.paymentMethod.processPayment(totalAmount);
//    }
//}









//package com.ilp.entity;
//
//import com.ilp.interfaces.PaymentOperations;
//
//public class Payment implements PaymentOperations {
//    @Override
//    public void makePayment(double totalAmount, String paymentMethod) {
//        System.out.println("Payment of $" + totalAmount + " made using " + paymentMethod);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
