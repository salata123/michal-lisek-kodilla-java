package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.user.SimpleUser;


import java.util.ArrayList;
import java.util.List;

public class TestingMain {

    public static void main(String[] args) {
/*
        OddNumbersExterminator firstTest = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        firstTest.exterminate(firstTest.insertNumbers(32, numbers));
*/
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        Circle circle = new Circle();
        shapeCollector.addShape(square);
        shapeCollector.addShape(circle);

        System.out.println(shapeCollector.toString());
        System.out.println(square.toString() + circle.toString());
    }




}