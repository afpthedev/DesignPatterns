package Behavioral.Observer.Obserable;

import Behavioral.Observer.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Obserable {

    private List<Observer> observers = new ArrayList<>();
    private String state;
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);

    }

    public void setState(String state) {
        this.state = state;
        notifyObserver(state);
    }

    @Override
    public void notifyObserver(String Message) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
