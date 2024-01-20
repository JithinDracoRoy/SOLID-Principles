package com.ilp.services;

import com.ilp.entity.Watch;
import com.ilp.interfaces.DateInterface;

public class SmartWatch extends Watch implements DateInterface{

	public SmartWatch(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayTime() {
		// TODO Auto-generated method stub
		System.out.println("Display Digital Time.");
	}

	@Override
	public void displayDate() {
		// TODO Auto-generated method stub
		System.out.println("Current Date");
	}

}
