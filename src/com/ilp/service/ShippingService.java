package com.ilp.service;

import com.ilp.entity.Products;
import com.ilp.entity.Stores;
import com.ilp.interfaces.Shipping;
import com.ilp.interfaces.StoreDisplay;
import com.ilp.interfaces.StoreLocatorByCity;
import com.ilp.interfaces.StoreLocatorByCountry;

public class ShippingService implements StoreDisplay, Shipping {

    private Stores stores;

    public ShippingService(Stores stores) {
        this.stores = stores;
    }

    @Override
    public void displayStores() {
        System.out.println("Store ID - " + stores.getStoreId());
        System.out.println("Store Name - " + stores.getStoreName());
        System.out.println("Store Address - " + stores.getAddress());
        for (Products product : stores.getProducts()) {
			System.out.println("Product Available - "+product.getProductName());
		}
    }

    @Override
    public void internationalShipping() {
        System.out.println("Ready for international Shipping from " + stores.getAddress());
        if (stores instanceof StoreLocatorByCountry) {
            StoreLocatorByCountry storeByCountry = (StoreLocatorByCountry) stores;
            System.out.println("It is an instance of StoreLocatorByCountry, Ready for international shipping from the country " + storeByCountry.getCountry());
        }
    }

    @Override
    public void localShipping() {
        System.out.println("Ready for local shipping from " + stores.getAddress());
        if (stores instanceof StoreLocatorByCity) {
            StoreLocatorByCity storeByCity = (StoreLocatorByCity) stores;
            System.out.println("It is an instance of StoreLocatorByCity, Ready for local shipping from the city " + storeByCity.getCity());
        }
    }
}
