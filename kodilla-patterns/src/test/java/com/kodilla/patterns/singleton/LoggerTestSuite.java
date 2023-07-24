package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    void testLog() {
        //Given
        Logger logger = Logger.LOG;
        String result = "Text1";
        logger.log(result);
        //When
        //Then
        assertEquals(result, logger.getLastLog());
    }
}
