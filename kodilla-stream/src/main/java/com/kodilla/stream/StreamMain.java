package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        String textToBeautify = "hello";
        String floor = "___";
        String abc = "ABC";
        String frame = "[]";
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(abc, textToBeautify, abc, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautify(frame, textToBeautify, frame, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautifyToUpperCase(floor, textToBeautify, floor, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautifyToUpperCase(frame, textToBeautify, frame, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautifySplitUpperCase(frame, textToBeautify, frame, (beautify1, text, beautify2) -> beautify1 + text + beautify2);


        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);
    }
}