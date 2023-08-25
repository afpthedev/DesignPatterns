package Structural.Bridge.carFactory;

import Structural.Bridge.car.car;

public class englishType  implements carFactory{

    @Override
    public void produce() {
        System.out.println("English Type Car has Produced");
    }
}
