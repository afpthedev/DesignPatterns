package Creational.Factory.Shapes;

import Creational.Factory.Shape;

public class Rectangle implements Shape
{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
