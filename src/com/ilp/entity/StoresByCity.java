package com.ilp.entity;

import com.ilp.interfaces.StoreLocatorByCity;

public class StoresByCity extends Stores implements StoreLocatorByCity{
	private String city;

	public StoresByCity(int storeId, String storeName,String address, String city) {
		super(storeId, storeName, address);
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	  public void findStoreByCity(String city) {
        // Implement actual store search logic based on city
        System.out.println("Stores found in " + city + ": " + getStoreName());
    }
}
