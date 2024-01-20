package com.ilp.interfaces;

import java.util.List;

import com.ilp.entity.Watch;

public interface QRCodeInterface {
    void generateQRCode(List<Watch> watchList);
    void displayQRCode(List<Watch> watchList);
    void hideQRCode(List<Watch> watchList);
}
