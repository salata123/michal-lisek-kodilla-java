package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        String textToBeautify = "Hello";
        String floor = "___";
        String abc = "ABC";
        String frame = "[]";
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(abc, textToBeautify, abc, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautify(frame, textToBeautify, frame, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
        poemBeautifier.beautify(floor, textToBeautify, floor, (beautify1, text, beautify2) -> beautify1 + text + beautify2);
    }
}