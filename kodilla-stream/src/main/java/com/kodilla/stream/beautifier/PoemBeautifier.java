package com.kodilla.stream.beautifier;


public class PoemBeautifier {
    public void beautify(String beautify1, String text, String beautify2, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(beautify1, text, beautify2));
    }

    public void beautifyToUpperCase(String beautify1, String text, String beautify2, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(beautify1, text.toUpperCase(), beautify2));
    }

    public void beautifySplitUpperCase(String beautify1, String text, String beautify2, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(beautify1, text.substring(0, 3).toUpperCase() + text.substring(3, 5).toLowerCase(), beautify2));
    }
}
