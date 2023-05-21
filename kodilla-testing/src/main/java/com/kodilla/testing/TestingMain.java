package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestingMain {

    public static void main(String[] args) {
        OddNumbersExterminator firstTest = new OddNumbersExterminator();
        firstTest.exterminate(firstTest.insertNumbers(32));
    }
}