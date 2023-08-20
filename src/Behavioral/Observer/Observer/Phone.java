package Behavioral.Observer.Observer;

import Behavioral.Observer.Obserable.WeatherStation;

public class Phone implements Observer {
    WeatherStation weatherStation;
    private String name;

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);

    }

    public void Display(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

}
