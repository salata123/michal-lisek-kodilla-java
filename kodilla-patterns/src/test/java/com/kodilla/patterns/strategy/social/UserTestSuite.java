package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        Millenials millenial = new Millenials("John");
        ZGeneration zGeneration = new ZGeneration("Alice");
        YGeneration yGeneration = new YGeneration("Stan");

        String expectedMillenialPost = "John is sharing on Facebook";
        String expectedGenZPost = "Alice is sharing on Twitter";
        String expectedGenYPost = "Stan is sharing on Snapchat";

        //When&Then
        assertEquals(expectedMillenialPost, millenial.sharePost());
        assertEquals(expectedGenZPost, zGeneration.sharePost());
        assertEquals(expectedGenYPost, yGeneration.sharePost());

    }
    @Test
    void testIndividualSharingStrategy(){
        Millenials millenials = new Millenials("Adam");
        millenials.setSocialPublisher(new TwitterPublisher());

        String expectedMillenialPost = "Adam is sharing on Twitter";


        assertEquals(expectedMillenialPost, millenials.sharePost());
    }
}
