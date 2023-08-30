package Behavioral.Mediator;

abstract class Flight {
    protected IMediator controlCenter;
    protected String flightNumber;

    public Flight(IMediator controlCenter, String flightNumber) {
        this.controlCenter = controlCenter;
        this.flightNumber = flightNumber;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
