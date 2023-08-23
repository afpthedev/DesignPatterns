package Structural.Adapter.USBC;

public class UsbcKeyboard implements USBC{
    @Override
    public void ConnectUSBC() {
        System.out.println("USBC Keyboard Has connect");
    }
}
