package Structural.Bridge.car;

import Structural.Bridge.carFactory.carFactory;

public abstract class car {

    protected carFactory carFactory;

    public car(carFactory carFactory) {
        this.carFactory = carFactory;
    }
   abstract void drive();

    abstract void sell();

   abstract void buy();

}
