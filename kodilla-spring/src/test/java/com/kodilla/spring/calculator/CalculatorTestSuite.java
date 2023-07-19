package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations(){
        double a = 10;
        double b = 20;

        double add = calculator.add(a, b);
        double addExpectedResult = 30;

        double sub = calculator.sub(a, b);
        double subExpectedResult = -10;

        double mul = calculator.mul(a, b);
        double mulExpectedResult = 200;

        double div = calculator.div(a, b);
        double divExpectedResult = 0.5;

        Assertions.assertEquals(addExpectedResult, add);
        Assertions.assertEquals(subExpectedResult, sub);
        Assertions.assertEquals(mulExpectedResult, mul);
        Assertions.assertEquals(divExpectedResult, div);
    }


}
