package Structural.Adapter;

import Structural.Adapter.Adapter.UsbAdaptor;
import Structural.Adapter.USB.Keyboard;
import Structural.Adapter.USB.Mouse;
import Structural.Adapter.Adapter.UsbcAdaptor;
import Structural.Adapter.USBC.UsbcKeyboard;
import Structural.Adapter.USBC.UsbcMouse;

public class main {
    public static void main(String[] args) {

        // USB Device
        Mouse mouse =  new Mouse();
        Keyboard keyboard =  new Keyboard();

        // USBC Device
        UsbcKeyboard usbcKeyboard =  new UsbcKeyboard();
        UsbcMouse usbcMouse =  new UsbcMouse();


        // Adaptor
        UsbcAdaptor usbcAdaptor =  new UsbcAdaptor(mouse);
        UsbAdaptor usbAdaptor =  new UsbAdaptor(usbcKeyboard);

        // Methods
        mouse.connectUsb();
        keyboard.connectUsb();

        usbcMouse.ConnectUSBC();
        usbcKeyboard.ConnectUSBC();


        usbcAdaptor.ConnectUSBC();
        usbAdaptor.ConnectUSBC();



    }
}
