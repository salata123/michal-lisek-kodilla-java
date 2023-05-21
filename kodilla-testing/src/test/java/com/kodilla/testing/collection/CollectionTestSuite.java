package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;

class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }



    @DisplayName("Testing if class works when the list is empty.")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator firstTest = new OddNumbersExterminator();
        if (firstTest.insertNumbers(0).size() == 0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        if (firstTest.insertNumbers(0).size() == 0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }

    @DisplayName("Testing if class works when the list contains odd and even numbers.")
    @Test
    public void testOddNumbersExterminatorNormalList (){
        OddNumbersExterminator firstTest = new OddNumbersExterminator();


        for (int i = 0; i < firstTest.insertNumbers(2).size(); i++){
            if (firstTest.insertNumbers(2).get(i) == i){
                System.out.println("test OK");
            } else {
                System.out.println("Error");
            }
        }
    }

}
