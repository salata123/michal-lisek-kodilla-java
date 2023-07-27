package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        String title1 = "Title1";
        String author1 = "Author1";
        LocalDate localDate1 = LocalDate.of(1999, 4, 3);
        Book book1 = new Book(title1, author1, localDate1);

        String title2 = "Title2";
        String author2 = "Author2";
        LocalDate localDate2 = LocalDate.of(2000, 2, 2);
        Book book2 = new Book(title2, author2, localDate2);

        String libraryName = "Library1";
        Library originalLibrary = new Library(libraryName);
        originalLibrary.getBooks().add(book1);
        originalLibrary.getBooks().add(book2);

        Library clonedLibrary = null;
        try {
            clonedLibrary = originalLibrary.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = originalLibrary.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        int expectedBookCountShallow = 1;
        int expectedBookCountDeep = 2;

        originalLibrary.getBooks().remove(book1);

        //Then
        assertEquals(expectedBookCountShallow, originalLibrary.getBooks().size());
        assertEquals(expectedBookCountShallow, clonedLibrary.getBooks().size());
        assertEquals(expectedBookCountDeep, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), originalLibrary.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), originalLibrary.getBooks());
    }
}
