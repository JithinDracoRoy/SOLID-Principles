package com.ilp.services;
import java.util.ArrayList;
import java.util.List;

import com.ilp.entity.Watch;
import com.ilp.interfaces.WatchListInterface;


public class Cart implements WatchListInterface{ 
	
	List<Watch> cartList = new ArrayList<Watch>();

	public Cart(List<Watch> cartList) {
		super();
		this.cartList = cartList;
	}

	public List<Watch> getCartList() {
		return cartList;
	}

	public void setCartList(List<Watch> cartList) {
		this.cartList = cartList;
	}

	@Override
	public void addWatch(Watch watch) {
		// TODO Auto-generated method stub
		System.out.println("Watch Added To Cart.");
	}

	@Override
	public void removeWatch(Watch watch) {
		// TODO Auto-generated method stub
		System.out.println("Watch Removed From Cart.");
	}
	
}
