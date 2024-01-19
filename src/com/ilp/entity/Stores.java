package com.ilp.entity;

import java.util.ArrayList;

public abstract class Stores{
	private int storeId;
    private String storeName;
    private String address;
    ArrayList<Products> products = new ArrayList<Products>();
    
	public ArrayList<Products> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Products> products) {
		this.products = products;
	}

	public Stores(int storeId, String storeName, String address) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.address = address;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
