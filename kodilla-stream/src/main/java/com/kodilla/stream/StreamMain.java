package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
/*
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        */

        String textToBeautify = "Hello";
        String floor = "___";
        String abc = "ABC";
        String frame = "[]";
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(abc, textToBeautify, abc, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautify(frame, textToBeautify, frame, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautify(floor, textToBeautify, floor, (beautify1, text, beautify2) -> beautify1 + text + beautify2);

    }
}