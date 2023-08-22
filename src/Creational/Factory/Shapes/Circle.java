package Creational.Factory.Shapes;

import Creational.Factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
