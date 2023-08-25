package Structural.Bridge;

import Structural.Bridge.car.SEDAN;
import Structural.Bridge.car.SUV;
import Structural.Bridge.carFactory.americanType;
import Structural.Bridge.carFactory.carFactory;
import Structural.Bridge.carFactory.englishType;

public class Bridge {
    public static void main(String[] args) {
        // Factory Methods
        carFactory americantype =  new americanType();
        carFactory englishType =  new englishType();

        // Car Methods

        SEDAN sedan = new SEDAN(americantype);
        SUV suv =  new SUV(englishType);

        sedan.buy();
        sedan.sell();

        suv.buy();
        suv.drive();
    }
}
