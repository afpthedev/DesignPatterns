package Structural.Adapter.USBC;

public class UsbcMouse implements USBC{
    @Override
    public void ConnectUSBC() {
        System.out.println("USBC Mouse Has connect");
    }
}
