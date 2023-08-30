package Behavioral.Mediator;

public class Mediator {
    public static void main(String[] args) {
        IMediator controlCenter = new AirTrafficControlCenter();

        Flight flight1 = new Airplane(controlCenter, "Flight 001");
        Flight flight2 = new Airplane(controlCenter, "Flight 002");
        Flight flight3 = new Airplane(controlCenter, "Flight 003");

        controlCenter.registerFlight(flight1);
        controlCenter.registerFlight(flight2);
        controlCenter.registerFlight(flight3);

        flight1.sendMessage("Preparing for takeoff.");
        flight2.sendMessage("Roger that, Flight 001.");
    }
}
