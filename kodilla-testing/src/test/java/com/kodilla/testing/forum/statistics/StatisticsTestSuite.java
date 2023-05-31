package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    @Mock
    private Statistics statistics;

    private int zeroPosts = 0;
    private int oneHundredPosts = 100;
    private int oneThousandPosts = 1000;
    private int zeroComments = 0;
    private int oneHundredComments = 100;
    private int oneThousandComments = 1000;
    private List<String> generateListOfUsers(int userNamesQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= userNamesQuantity; i++) {
            resultList.add("User#" + i);
        }
        return resultList;
    }


    @Test
    void testWhenNoPosts(){
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        when(statistics.postsCount()).thenReturn(zeroPosts);
        when(statistics.commentsCount()).thenReturn(oneThousandComments);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        statisticsCalculations.calculateAdvStatistics(statistics);

        assertEquals(10, statisticsCalculations.numberOfUsers());
        assertEquals(0, statisticsCalculations.numberOfPosts());
        assertEquals(1000, statisticsCalculations.numberOfComments());
        assertEquals(100.0, statisticsCalculations.averageCommentsPerUserAmount());
        assertEquals(0.0, statisticsCalculations.averagePostPerUserAmount());
    }

    @Test
    void testWhen1000Posts(){
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        when(statistics.postsCount()).thenReturn(oneThousandPosts);
        when(statistics.commentsCount()).thenReturn(zeroComments);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        statisticsCalculations.calculateAdvStatistics(statistics);

        assertEquals(10, statisticsCalculations.numberOfUsers());
        assertEquals(1000, statisticsCalculations.numberOfPosts());
        assertEquals(0, statisticsCalculations.numberOfComments());
        assertEquals(100.0, statisticsCalculations.averagePostPerUserAmount());
        assertEquals(0.0, statisticsCalculations.averageCommentsPerUserAmount());
        assertEquals(0.0, statisticsCalculations.averageCommentsPerPostAmount());
    }

    @Test
    void testWhenNoComments(){
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        when(statistics.postsCount()).thenReturn(oneThousandPosts);
        when(statistics.commentsCount()).thenReturn(zeroComments);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        statisticsCalculations.calculateAdvStatistics(statistics);

        assertEquals(10, statisticsCalculations.numberOfUsers());
        assertEquals(1000, statisticsCalculations.numberOfPosts());
        assertEquals(0, statisticsCalculations.numberOfComments());
        assertEquals(100.0, statisticsCalculations.averagePostPerUserAmount());
        assertEquals(0.0, statisticsCalculations.averageCommentsPerUserAmount());
        assertEquals(0.0, statisticsCalculations.averageCommentsPerPostAmount());
    }

    @Test
    void testWhenCommentsLessThanPosts(){
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        when(statistics.postsCount()).thenReturn(oneThousandPosts);
        when(statistics.commentsCount()).thenReturn(oneHundredComments);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        statisticsCalculations.calculateAdvStatistics(statistics);

        assertEquals(10, statisticsCalculations.numberOfUsers());
        assertEquals(1000, statisticsCalculations.numberOfPosts());
        assertEquals(100, statisticsCalculations.numberOfComments());
        assertEquals(100.0, statisticsCalculations.averagePostPerUserAmount());
        assertEquals(10.0, statisticsCalculations.averageCommentsPerUserAmount());
        assertEquals(0.1, statisticsCalculations.averageCommentsPerPostAmount());
    }

    @Test
    void testWhenCommentsGreaterThanPosts(){
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        when(statistics.postsCount()).thenReturn(oneHundredPosts);
        when(statistics.commentsCount()).thenReturn(oneThousandComments);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        statisticsCalculations.calculateAdvStatistics(statistics);

        assertEquals(10, statisticsCalculations.numberOfUsers());
        assertEquals(100, statisticsCalculations.numberOfPosts());
        assertEquals(1000, statisticsCalculations.numberOfComments());
        assertEquals(10.0, statisticsCalculations.averagePostPerUserAmount());
        assertEquals(100.0, statisticsCalculations.averageCommentsPerUserAmount());
        assertEquals(10, statisticsCalculations.averageCommentsPerPostAmount());
    }

    @Test
    void testWhenNoUsers(){
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        when(statistics.postsCount()).thenReturn(oneThousandPosts);
        when(statistics.commentsCount()).thenReturn(oneHundredComments);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(0));

        statisticsCalculations.calculateAdvStatistics(statistics);

        assertEquals(0, statisticsCalculations.numberOfUsers());
        assertEquals(1000, statisticsCalculations.numberOfPosts());
        assertEquals(100, statisticsCalculations.numberOfComments());
        assertTrue(Double.isInfinite(statisticsCalculations.averagePostPerUserAmount()));
        assertTrue(Double.isInfinite(statisticsCalculations.averageCommentsPerUserAmount()));
        assertEquals(0.1, statisticsCalculations.averageCommentsPerPostAmount());
    }

    @Test
    void testWhen100Users(){
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        when(statistics.postsCount()).thenReturn(oneThousandPosts);
        when(statistics.commentsCount()).thenReturn(oneHundredComments);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(100));

        statisticsCalculations.calculateAdvStatistics(statistics);

        assertEquals(100, statisticsCalculations.numberOfUsers());
        assertEquals(1000, statisticsCalculations.numberOfPosts());
        assertEquals(100, statisticsCalculations.numberOfComments());
        assertEquals(10.0, statisticsCalculations.averagePostPerUserAmount());
        assertEquals(1.0, statisticsCalculations.averageCommentsPerUserAmount());
        assertEquals(0.1, statisticsCalculations.averageCommentsPerPostAmount());
    }
}
