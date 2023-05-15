package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(3,4);

        Integer calculatorAddResult = calculator.add();

        if (calculatorAddResult == 7){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator1 = new Calculator(10, 9);
        Integer calculatorSubtractResult = calculator1.subtract();

        if (calculatorSubtractResult == 1){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}