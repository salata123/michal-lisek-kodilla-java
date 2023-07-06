package com.kodilla.rps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class rpsTestSuite {
    @Test
    @DisplayName("Testing if score returns a draw")
    void testDraw() {
        //Given
        Choices choices = new Choices();

        //When
        String playerChoice = "1";
        String aiChoice = "1";
        int[] result = new int[2];
        int[] expectedResult = new int[2];
        expectedResult[0] = 0;
        expectedResult[1] = 0;
        choices.result(playerChoice, aiChoice, result[0], result[1]);

        //Then
        assertEquals(expectedResult[0], choices.getResult()[0]);
        assertEquals(expectedResult[1], choices.getResult()[1]);
    }

    @Test
    @DisplayName("Testing if score returns point for AI")
    void testAiScore() {
        //Given
        Choices choices = new Choices();

        //When
        String playerChoice = "1";
        String aiChoice = "2";
        int[] result = new int[2];
        int[] expectedResult = new int[2];
        expectedResult[0] = 0;
        expectedResult[1] = 1;
        choices.result(playerChoice, aiChoice, result[0], result[1]);

        //Then
        assertEquals(expectedResult[0], choices.getResult()[0]);
        assertEquals(expectedResult[1], choices.getResult()[1]);
    }
    @Test
    @DisplayName("Testing if score returns point for the Player")
    void testPlayerScore() {
        //Given
        Choices choices = new Choices();

        //When
        String playerChoice = "2";
        String aiChoice = "1";
        int[] result = new int[2];
        int[] expectedResult = new int[2];
        expectedResult[0] = 1;
        expectedResult[1] = 0;
        choices.result(playerChoice, aiChoice, result[0], result[1]);

        //Then
        assertEquals(expectedResult[0], choices.getResult()[0]);
        assertEquals(expectedResult[1], choices.getResult()[1]);
    }
}
