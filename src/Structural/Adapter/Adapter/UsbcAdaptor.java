package Structural.Adapter.Adapter;

import Structural.Adapter.USB.Usb;
import Structural.Adapter.USBC.USBC;

public class UsbcAdaptor implements USBC {
        private Usb UsbDevice;

    public UsbcAdaptor(Usb usbDevice) {
        UsbDevice = usbDevice;
    }

    @Override
    public void ConnectUSBC() {
        System.out.println("USBC TO USB ADAPTED.");
    }
}
