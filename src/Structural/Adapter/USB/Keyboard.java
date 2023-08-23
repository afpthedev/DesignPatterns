package Structural.Adapter.USB;

public class Keyboard extends Usb{
    @Override
    public void connectUsb() {
        System.out.println("USB Mouse Has connect");
    }
}
