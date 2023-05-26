package com.kodilla.testing.shape;

public class Triangle implements Shape{
    @Override
    public String getShapeName(){
        return "Triangle";
    }

    @Override
    public double getField() {
        return 30.4;
    }

    @Override
    public String toString() {
        return getShapeName()  + " field: " + getField();
    }
}
