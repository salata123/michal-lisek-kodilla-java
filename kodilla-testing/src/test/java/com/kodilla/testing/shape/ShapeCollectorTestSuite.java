package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    @DisplayName("Testing empty list")
    void emptyList(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Assertions.assertEquals(0, shapeCollector.shapeList.size());
    }

    @Test
    @DisplayName("Test: adding a shape to a list")
    void shapeAddTest(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.addShape(square);

        Assertions.assertEquals(0,shapeCollector.removeShape(square).size());
    }

    @Test
    @DisplayName("Test: selecting an object from the shape collection list")
    void selectObject(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        shapeCollector.addShape(square);
        shapeCollector.addShape(circle);

        Assertions.assertEquals(square, shapeCollector.getObject(0));
        Assertions.assertEquals(circle, shapeCollector.getObject(1));
    }
    @Test
    @DisplayName("Test: printing out objects to a string")
    void toStringList(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        shapeCollector.addShape(square);
        shapeCollector.addShape(circle);

        Assertions.assertEquals(square.getShapeName() + circle.getShapeName(), shapeCollector.showFigures());
    }


    @Test
    @DisplayName("Test: adding a shape to a list")
    void removeShapeTest(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.addShape(square);

        Assertions.assertEquals(1, shapeCollector.shapeList.size());
    }


}
