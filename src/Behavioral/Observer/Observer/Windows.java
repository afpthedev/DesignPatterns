package Behavioral.Observer.Observer;

import Behavioral.Observer.Obserable.WeatherStation;

public class Windows implements Observer{
    WeatherStation weatherStation;
    @Override
    public void update(String update) {
        System.out.println("Your Message is : " + update);
    }

    @Override
    public void Display(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

}
