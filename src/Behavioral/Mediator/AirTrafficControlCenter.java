package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlCenter implements IMediator{

    private List<Flight> flights = new ArrayList<>();

    @Override
    public void registerFlight(Flight flight) {

    }

    @Override
    public void sendMessage(String Message) {

    }
}
