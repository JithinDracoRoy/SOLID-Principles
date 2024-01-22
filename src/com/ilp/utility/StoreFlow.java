package com.ilp.utility;

import com.ilp.entity.Bill;
import com.ilp.entity.Cart;
import com.ilp.entity.Payment;
import com.ilp.entity.Product;
import com.ilp.interfaces.PaymentMethod;
import com.ilp.service.BillGenerator;
import com.ilp.service.CartServices;
import com.ilp.service.CreditCardPayment;
import com.ilp.service.NetBanking;
import com.ilp.service.OfflinePayment;
import com.ilp.service.OnlinePayment;
import com.ilp.service.UpiPayment;
import com.ilp.service.BillCalculator;

public class StoreFlow {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product = new Product();
        // Assuming product details are set appropriately
        CartServices cartservices=new CartServices();
        cartservices.addToCart(cart, product);
        cartservices.removeFromCart(cart, product);
        cartservices.viewCart(cart);

        Bill bill = new Bill(500.0);

        // Use BillCalculator to calculate the total
        BillCalculator billCalculator = new BillCalculator();
        double total = billCalculator.calculateTotal(bill);
        System.out.println("Total: $" + total);
        
        PaymentMethod creditCardPayment = new CreditCardPayment();
        Payment payment = new Payment(creditCardPayment);
        payment.makePayment(100.0, "Credit Card");

        PaymentMethod netbanking = new NetBanking();
        payment = new Payment(netbanking);
        payment.makePayment(100.0, "Net Banking");


        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBillDetails(bill);

        Payment onlinePayment = new OnlinePayment();
        onlinePayment.makePayment(total, "Online");

        Payment offlinePayment = new OfflinePayment();
        offlinePayment.makePayment(total, "Cash");
        
        PaymentMethod upiPaymentMethod = new UpiPayment();
        Payment newPayment = new Payment(upiPaymentMethod);
        newPayment.makePayment(total, "New Payment Method");

        
    }
}
