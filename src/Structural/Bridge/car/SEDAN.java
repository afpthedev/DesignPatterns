package Structural.Bridge.car;

import Structural.Bridge.carFactory.carFactory;

public class SEDAN extends car {

    public SEDAN(carFactory carFactory) {
        super(carFactory);
    }

    protected String name = "SEDAN";

    @Override
    public void drive() {
        System.out.println("This "+ name+ " is going");
    }

    @Override
    public void sell() {
        System.out.println("This "+ name+ " is  selled");


    }

    @Override
    public void buy() {
        System.out.println("This "+ name+ "is  bought");

    }
}
