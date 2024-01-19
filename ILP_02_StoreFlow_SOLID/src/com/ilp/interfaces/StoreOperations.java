package com.ilp.interfaces;

import java.util.List;

import com.ilp.entity.Watch;

public interface StoreOperations {
    void addItemToCart(Watch watch);
    void removeItemFromCart(Watch watch);
    void viewCart();
    void checkout(Order order);
    List<Watch> getProducts(); 
}
