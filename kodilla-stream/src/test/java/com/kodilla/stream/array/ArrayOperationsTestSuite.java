package com.kodilla.stream.array;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite{
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        //When

        //Then
        double testAverage = ArrayOperations.getAverage(numbers);
        double testAverage2 = ArrayOperations.getAverage(numbers2);


        assertEquals(1.0, testAverage);
        assertEquals(10.5, testAverage2);
    }
}
