package Behavioral.Mediator;

public class Airplane extends Flight{
    public Airplane(IMediator controlCenter, String flightNumber) {
        super(controlCenter, flightNumber);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("I'm Cominggg ");
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("I'm Going");
    }
}
