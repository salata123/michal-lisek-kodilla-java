package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector{

    public void hey(){
    }
    List<Shape> shapeList = new ArrayList<>();

    public List<Shape> addFigure(Shape shape){
        shapeList.add(shape);
        return shapeList;
    }

    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public List<Shape> removeFigure(Shape shape){
        List<Shape> removeShape = new ArrayList<>();
        removeShape.addAll(shapeList);
        removeShape.remove(shape);
        return removeShape;
        }

    public String showFigures(){
        String figures = "";
        for (int i = 0; i < shapeList.size(); i++){
            figures += (shapeList.get(i).getShapeName());
        }
        return figures;
    }
}

