package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Products;
import com.ilp.entity.StoresByCity;
import com.ilp.entity.StoresByCountry;
import com.ilp.service.*;

public class Utility {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Products product1 = new Products("P001","Submariner",3489400);
        Products product2 = new Products("P002","Deep Sea",734567);
        Products product3 = new Products("P003","GMT Master",4567890);
        Products product4 = new Products("P004","Air-King",9876540);
        
        StoresByCity storesByCity = new StoresByCity(1, "Kirk Freeport Plaza Ltd", "Bayshore Mall, Harbour Drive George Town Grand Cayman","New York");
        storesByCity.getProducts().add(product1);
        storesByCity.getProducts().add(product2);
        StoresByCountry storesByCountry = new StoresByCountry(2, "Pedrart Exclusive Rolex Store", "Park Shopping SAI/SO Área 6580 Loja 174 71219-900 Main St", "Canada");
        storesByCountry.getProducts().add(product3);
        storesByCountry.getProducts().add(product4);
        
        Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		ShippingService shippingService1 = new ShippingService(storesByCity);
		shippingService1.displayStores();
		scanner.nextLine();
		storesByCity.findStoreByCity("New York");
		scanner.nextLine();
		shippingService1.localShipping();
		scanner.nextLine();
		ShippingService shippingService2 = new ShippingService(storesByCountry);
		shippingService2.displayStores();
		scanner.nextLine();
		storesByCountry.findStoreByCountry("Canada");
		scanner.nextLine();
		shippingService2.internationalShipping();
		scanner.nextLine();
	}

}
