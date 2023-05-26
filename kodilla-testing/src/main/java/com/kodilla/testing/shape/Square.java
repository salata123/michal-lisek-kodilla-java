package com.kodilla.testing.shape;

public class Square implements Shape{
    @Override
    public String getShapeName(){
        return "Square";
    }

    @Override
    public double getField() {
        return 10;
    }

    @Override
    public String toString() {
        return getShapeName()  + " field: " + getField();
    }
}
