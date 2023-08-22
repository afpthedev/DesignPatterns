package Creational.Factory.Shapes;

import Creational.Factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
