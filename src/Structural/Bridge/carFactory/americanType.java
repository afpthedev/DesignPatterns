package Structural.Bridge.carFactory;

import Structural.Bridge.car.car;

public class americanType implements carFactory{
    @Override
    public void produce() {
        System.out.println("American Type Car Has Produced.");

    }
}
