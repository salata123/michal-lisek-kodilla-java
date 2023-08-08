package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuLogic {
    public void checkRow(SudokuBoard sudokuBoard, int row) {
        List<Integer> toDeleteListRow = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int value = sudokuBoard.getRow(row).getElement(i).getValue();

            if (value != SudokuElement.EMPTY) {
                if (!toDeleteListRow.contains(value)) {
                    toDeleteListRow.add(value);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            sudokuBoard.getRow(row).getElement(i).getAvailableNumbers().removeAll(toDeleteListRow);
        }
    }

    public void checkColumn(SudokuBoard sudokuBoard, int col) {
        List<Integer> toDeleteListCol = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int value = sudokuBoard.getRow(i).getElement(col).getValue();

            if (value != SudokuElement.EMPTY) {
                if (!toDeleteListCol.contains(value)) {
                    toDeleteListCol.add(value);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            sudokuBoard.getRow(i).getElement(col).getAvailableNumbers().removeAll(toDeleteListCol);
        }
    }

    public void checkSquares(SudokuBoard sudokuBoard, int startRow, int startCol) {
        List<Integer> toDeleteListSq = new ArrayList<>();

        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                int value = sudokuBoard.getRow(row).getElement(col).getValue();

                if (value != SudokuElement.EMPTY) {
                    if (!toDeleteListSq.contains(value)) {
                        toDeleteListSq.add(value);
                    }
                }
            }
        }

        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                sudokuBoard.getRow(row).getElement(col).getAvailableNumbers().removeAll(toDeleteListSq);
            }
        }
    }
}