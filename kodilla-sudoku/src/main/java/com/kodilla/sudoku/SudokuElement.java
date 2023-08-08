package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement implements Cloneable{
    public static int EMPTY = -1;
    private int value;
    private final List<Integer> availableNumbers;

    public SudokuElement(){
        this.value = EMPTY;
        this.availableNumbers = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            availableNumbers.add(i);
        }
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public List<Integer> getAvailableNumbers() {
        return availableNumbers;
    }

    @Override
    public String toString() {
        return "SudokuElement{" +
                "value=" + value +
                ", availableNumbers=" + availableNumbers +
                '}';
    }

    @Override
    public SudokuElement clone(){
        SudokuElement clonedElement = new SudokuElement();
        clonedElement.setValue(this.value);
        clonedElement.availableNumbers.clear();
        clonedElement.availableNumbers.addAll(this.availableNumbers);
        return clonedElement;
    }
}
