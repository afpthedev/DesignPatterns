package Structural.Adapter.Adapter;

import Structural.Adapter.USBC.USBC;

public class UsbAdaptor implements USBC {
        private USBC UsbcDevice;

    public UsbAdaptor(USBC usbcDevice) {
        UsbcDevice = usbcDevice;
    }


    @Override
    public void ConnectUSBC() {
        System.out.println("USB TO USBC ADAPTED.");
    }
}
