package Behavioral.Observer;

import Behavioral.Observer.Obserable.Obserable;
import Behavioral.Observer.Obserable.WeatherStation;
import Behavioral.Observer.Observer.Phone;
import Behavioral.Observer.Observer.Windows;

public class Main {
    public static void main(String[] args) {
        // Creating an Observable (Subject)
        WeatherStation weatherStation = new WeatherStation();

        // Creating Observers
        Phone phone = new Phone();
        Windows windows = new Windows();

        // Adding Observers to the Observable
        weatherStation.add(phone);
        weatherStation.add(windows);

        // Notifying Observers about a state change
        weatherStation.setState("New Object Added");

        // Removing an Observer from the Observable
        weatherStation.remove(phone);

        // Notifying Observers about a state change
        weatherStation.setState("Object deleted");



    }
}
