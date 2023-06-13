package com.kodilla.exception.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExceptionHandling {
    public String exceptionHandling(double x, double y){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            return secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e){
            System.out.println("Exception: " + e);
            return null;
        } finally {
            System.out.println(LocalDateTime.now());
        }
    }
}
