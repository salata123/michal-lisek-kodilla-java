package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

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



    @Test
    @DisplayName("Testing if class works when the list is empty.")
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator firstTest = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        firstTest.insertNumbers(0, numbers);
        if (numbers.size() == 0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }

    @Test
    @DisplayName("Testing if class works when the list contains odd and even numbers.")
    public void testOddNumbersExterminatorNormalList (){
        OddNumbersExterminator firstTest = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        firstTest.insertNumbers(2, numbers);

        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == i){
                System.out.println("test OK");
            } else {
                System.out.println("Error");
            }
        }
    }

}
