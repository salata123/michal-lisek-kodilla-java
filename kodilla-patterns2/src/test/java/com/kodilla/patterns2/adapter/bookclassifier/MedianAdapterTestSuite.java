package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //Given
        Set<BookA> bookASet= new HashSet<>();
        bookASet.add(new BookA("Author1", "Title1", 2000, "Signature1"));
        bookASet.add(new BookA("Author2", "Title2", 1995, "Signature2"));
        bookASet.add(new BookA("Author3", "Title3", 2010, "Signature3"));

        Statistics statistics = new Statistics();
        MedianAdapter medianAdapter = new MedianAdapter(statistics);

        //When
        int result = medianAdapter.publicationYearMedian(bookASet);

        //Then
        assertEquals(2000, result);
    }
}
