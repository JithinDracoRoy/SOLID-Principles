package com.ilp.interfaces;

import java.util.List;

import com.ilp.entity.Watch;

public interface CartOperations {
    void addProduct(Watch watch);
    void removeProduct(Watch watch);
    List<Watch> getProducts();
    double calculateTotalAmount();
}

