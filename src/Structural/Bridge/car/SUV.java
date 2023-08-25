package Structural.Bridge.car;

import Structural.Bridge.carFactory.carFactory;

public class SUV extends car {



    protected String name = "SUV";

    public SUV(Structural.Bridge.carFactory.carFactory carFactory) {
        super(carFactory);
    }

    @Override
    public void drive() {
        System.out.println("This "+ name+ "is going");
    }

    @Override
    public void sell() {
        System.out.println("This "+ name+ "is  selled");

    }

    @Override
    public void buy() {
        System.out.println("This "+ name+ "is  bought");

    }
}
