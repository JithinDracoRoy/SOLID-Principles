package com.ilp.services;

import com.ilp.entity.Watch;

public class AnalogWatch extends Watch {

	public AnalogWatch(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override     
	public void displayTime() {
		// TODO Auto-generated method stub
		System.out.println("Display Analog Time.");
	}

}
