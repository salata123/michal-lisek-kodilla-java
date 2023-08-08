package com.kodilla.sudoku;

public class SudokuInfoPrinter {
    public void initialInfo(){
        System.out.println("Input numbers from 0 to 9 to select row, column and number to put in the chosen spot or type \"SUDOKU\" to resolve created sudoku");
        System.out.println("Please, make sure to put ',' between numbers.");
        System.out.println("Example: '1,2,3' will add number 3 into x1:y2 spot.");
    }
}
