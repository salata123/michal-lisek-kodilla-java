package com.kodilla.patterns.looptesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testLoopAndConditionalBreakpoints {
    @Test
    public void testLoop(){
        long sum = 0;
        for(int n = 0; n < 1000; n++){
            sum += n;
            System.out.println(n + " sum equals " + sum);
        }
        assertEquals(499500, sum);
    }

}
