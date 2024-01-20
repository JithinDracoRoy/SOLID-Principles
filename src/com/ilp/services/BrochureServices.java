package com.ilp.services;

import com.ilp.entity.Watch;
import com.ilp.interfaces.BrochureInterface;

public class BrochureServices implements BrochureInterface {
	
	@Override
	public void downloadBrochure(Watch watch) {
		System.out.println("Downloaded Brochure.");
		
	}

}
