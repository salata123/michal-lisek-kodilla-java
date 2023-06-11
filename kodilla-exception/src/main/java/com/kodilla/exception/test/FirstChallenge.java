package com.kodilla.exception.test;

import java.time.LocalDate;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result;

        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            result = 0;
        } finally {
            System.out.println(LocalDate.now());
        }
        System.out.println(result);

        try {
            result = firstChallenge.divide(3, 1);
        } catch (ArithmeticException e) {
            result = 0;
        } finally {
            System.out.println(LocalDate.now());
        }
        System.out.println(result);
    }
}