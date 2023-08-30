package Behavioral.Mediator;

public class Helicopter extends Flight{
    public Helicopter(IMediator controlCenter, String flightNumber) {
        super(controlCenter, flightNumber);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("I'm Helicopter");
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("I'm going ");
    }
}
