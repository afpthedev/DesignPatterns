package Behavioral.Observer.Obserable;

import Behavioral.Observer.Observer.Observer;

public interface Obserable {
    public void add(Observer obserable);
    public void remove(Observer obserable);
    void notifyObserver(String Message);


}
