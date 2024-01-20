package com.ilp.services;

import java.util.ArrayList;
import java.util.List;

import com.ilp.entity.Watch;
import com.ilp.interfaces.WatchListInterface;

public class Wishlist implements WatchListInterface{
	
	List<Watch> wishlist = new ArrayList<Watch>();
	@Override
	public void addWatch(Watch watch) {
		// TODO Auto-generated method stub
		System.out.println("Watch Added To Wishlist");
	}

	@Override
	public void removeWatch(Watch watch) {
		// TODO Auto-generated method stub
		System.out.println("Watch Removed From Wishlist");
	}

	public Wishlist(List<Watch> wishlist) {
		super();
		this.wishlist = wishlist;
	}

	public List<Watch> getWishlist() {
		return wishlist;
	}

	public void setWishlist(List<Watch> wishlist) {
		this.wishlist = wishlist;
	}
	



}
