package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SudokuSolver {
    private SudokuLogic sudokuLogic = new SudokuLogic();
    public void updatePossibleValues(SudokuBoard sudokuBoard) {
        for(int i = 0; i < 9; i++){
            sudokuLogic.checkRow(sudokuBoard, i);
            sudokuLogic.checkColumn(sudokuBoard, i);
        }
        for(int i = 0; i < 9; i+=3){
            for(int j = 0; j < 9; j+=3){
                sudokuLogic.checkSquares(sudokuBoard, i, j);
            }
        }
    }

    public SudokuBoard solve(SudokuBoard sudokuBoard) {
        int counter = 1;
        while(emptyCheck(sudokuBoard)) {
            SudokuBoard clonedBoard = new SudokuBoard().clone();
            boolean success = fillEmptyElements(clonedBoard);

            if(!success){
                System.out.println("No available numbers, starting over. Attempt#" + counter);
                counter++;
            }

            if (success) {
                SudokuBoard solvedBoard = solve(clonedBoard);
                if (solvedBoard != null){
                    System.out.println("Sudoku solved!");
                    return solvedBoard;
                }
            }
        }
        return sudokuBoard;
    }

    private boolean fillEmptyElements(SudokuBoard sudokuBoard){
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j++) {
                if (sudokuBoard.getRow(i).getElement(j).getValue() == SudokuElement.EMPTY) {
                    List<Integer> availableNumbers = new ArrayList<>(sudokuBoard.getRow(i).getElement(j).getAvailableNumbers());

                    if(!availableNumbers.isEmpty()) {
                        int valueToPut = getRandomValue(availableNumbers);
                        sudokuBoard.putNumber(i, j, valueToPut);
                        updatePossibleValues(sudokuBoard);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private int getRandomValue(List<Integer> availableNumbers){
        Random random = new Random();
        int randomInt = random.nextInt(availableNumbers.size());
        return availableNumbers.get(randomInt);
    }

    public boolean emptyCheck(SudokuBoard sudokuBoard){
        boolean containsEmpty = true;
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j++) {
                if (sudokuBoard.getRow(i).getElement(j).getValue() == SudokuElement.EMPTY) {
                    containsEmpty = true;
                } else {
                    containsEmpty = false;
                }
            }
        }
        return containsEmpty;
    }
}
