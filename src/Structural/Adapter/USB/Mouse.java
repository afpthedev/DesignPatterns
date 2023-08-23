package Structural.Adapter.USB;

public class Mouse extends Usb{
    @Override
    public void connectUsb() {
        System.out.println("USB Mouse Has connect");
    }
}
