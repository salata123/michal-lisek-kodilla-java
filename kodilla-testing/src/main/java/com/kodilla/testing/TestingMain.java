package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;


import java.util.ArrayList;
import java.util.List;

public class TestingMain {

    public static void main(String[] args) {
        OddNumbersExterminator firstTest = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        firstTest.exterminate(firstTest.insertNumbers(32, numbers));
    }
}