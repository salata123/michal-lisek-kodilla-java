package com.kodilla.stream.beautifier;


public class PoemBeautifier {
    public void beautify(String beautify1, String text, String beautify2, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(beautify1, text, beautify2));
    }
}
