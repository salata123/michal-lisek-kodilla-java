package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow implements Cloneable{
    private List<SudokuElement> elements;

    public SudokuRow() {
        this.elements = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            elements.add(new SudokuElement());
        }
    }
    @Override
    public String toString() {
        StringBuilder rowToPrint = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if(elements.get(i).getValue() == SudokuElement.EMPTY){
                rowToPrint.append("[ ]");
            } else {
                rowToPrint.append("[" + elements.get(i).getValue() + "]");
            }
            if (i == 2 || i == 5) {
                rowToPrint.append("|");
            }
        }
        return rowToPrint.toString();
    }

    public List<SudokuElement> getElementsList() {
        return elements;
    }

    public SudokuElement getElement(int elementIndex){
        return elements.get(elementIndex);
    }

    @Override
    public SudokuRow clone(){
        SudokuRow clonedRow = new SudokuRow();
        for (int i = 0; i < 9; i++){
            clonedRow.elements.set(i, this.elements.get(i).clone());
        }
        return clonedRow;
    }
}
