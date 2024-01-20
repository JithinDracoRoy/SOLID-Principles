package com.ilp.services;

import java.util.List;

import com.ilp.entity.Watch;
import com.ilp.interfaces.QRCodeInterface;

public class QRCodeServices implements QRCodeInterface {

	@Override
	public void generateQRCode(List<Watch> watchList) {
		// TODO Auto-generated method stub
		System.out.println("Generate QR Code.");
	}

	@Override
	public void displayQRCode(List<Watch> watchList) {
		// TODO Auto-generated method stub
		System.out.println("Show QR Code.");
	}

	@Override
	public void hideQRCode(List<Watch> watchList) {
		// TODO Auto-generated method stub
		System.out.println("Hide QR Code.");
	}

}
