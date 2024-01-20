package com.ilp.services;

import com.ilp.interfaces.DateInterface;

public class AnalogWatchWithDate extends AnalogWatch implements DateInterface {

	public AnalogWatchWithDate(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDate() {
		// TODO Auto-generated method stub
		System.out.println("Current Date.");
	}

}
