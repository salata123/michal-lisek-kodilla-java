package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void workingTest() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //when
        String expectedResult = "Done!";

        //then
        assertEquals(expectedResult, exceptionHandling.exceptionHandling(1.5, 0));
    }

    @Test
    void exceptionThrowTest() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 0));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9999, 0));
    }

    @Test
    void exceptionCatching() {
        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        // when & then
        assertDoesNotThrow(() -> exceptionHandling.exceptionHandling(0, 1.5));
        assertDoesNotThrow(() -> exceptionHandling.exceptionHandling(1, 0));
        assertDoesNotThrow(() -> exceptionHandling.exceptionHandling(2, 0));
    }
}
