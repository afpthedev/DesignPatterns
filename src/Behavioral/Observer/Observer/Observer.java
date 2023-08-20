package Behavioral.Observer.Observer;

import Behavioral.Observer.Obserable.WeatherStation;

public interface Observer {
    public void update(String update);
    public void Display(WeatherStation weatherStation);

    }
