package com.kodilla.testing.shape;

public class Circle implements Shape{
    @Override
    public String getShapeName(){
        return "Circle";
    }

    @Override
    public double getField() {
        return 25;
    }

    @Override
    public String toString() {
        return getShapeName()  + " field: " + getField();
    }
}
