package com.ilp.entity;

import com.ilp.interfaces.StoreLocatorByCountry;

public class StoresByCountry extends Stores implements StoreLocatorByCountry{
	private String country;

	public StoresByCountry(int storeId, String storeName, String address,String country) {
		super(storeId, storeName, address);
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public void findStoreByCountry(String country) {
        // Implement actual store search logic based on country
        System.out.println("Stores found in " + country + ": " + getStoreName());
    }

}
