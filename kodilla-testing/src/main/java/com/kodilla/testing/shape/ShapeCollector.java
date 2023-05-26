package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector{

    public void hey(){
    }
    List<Shape> shapeList = new ArrayList<>();

    public List<Shape> addShape(Shape shape){
        shapeList.add(shape);
        return shapeList;
    }

    public Shape getObject(int n){
        return shapeList.get(n);
    }

    public List<Shape> removeShape(Shape shape){
        List<Shape> removeShape = new ArrayList<>();
        removeShape.addAll(shapeList);
        removeShape.remove(shape);
        return removeShape;
        }

    public String showFigures(){
        return "Figures";
    }
}

