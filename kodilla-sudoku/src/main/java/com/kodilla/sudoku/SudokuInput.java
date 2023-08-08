package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuInput {
    private SudokuSolver sudokuSolver = new SudokuSolver();
    private SudokuInfoPrinter sudokuInfoPrinter = new SudokuInfoPrinter();

    public boolean playerInput(SudokuBoard sudokuBoard) {
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            System.out.println(sudokuBoard);
            sudokuInfoPrinter.initialInfo();

            String input = scanner.next();

            if (input.equals("SUDOKU")) {
                SudokuBoard solvedBoard = sudokuSolver.solve(sudokuBoard);
                System.out.println(solvedBoard);
                return true;
            }

            String[] inputParts = input.split(",");
            if(inputParts.length != 3) {
                System.out.println("Invalid input, please make sure that there is ',' between numbers and try again.");
                continue;
            }

            try{
                int row = Integer.parseInt(inputParts[0].trim()) - 1;
                int col = Integer.parseInt(inputParts[1].trim()) - 1;
                int value = Integer.parseInt(inputParts[2].trim());

                if (row < 0 || row > 8 || col < 0 || col > 8 || value < 1 || value > 9){
                    System.out.println("Invalid input, please provide 3 numbers from 0 to 9.");
                    break;
                }

                if (sudokuBoard.getRow(row).getElement(col).getValue() != SudokuElement.EMPTY){
                    System.out.println("In chosen spot a number already exist, please chose another spot.");
                    break;
                }

                if (!sudokuBoard.getRow(row).getElement(col).getAvailableNumbers().contains(value)){
                    System.out.println("This number already appears in this row, column or box. Please chose another number.");
                    break;
                }

                if (sudokuBoard.getRow(row).getElement(col).getValue() == SudokuElement.EMPTY && sudokuBoard.getRow(row).getElement(col).getAvailableNumbers().contains(value)){
                    sudokuBoard.putNumber(row, col, value);
                    sudokuSolver.updatePossibleValues(sudokuBoard);
                    validInput = true;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid input, please make sure that there is ',' between numbers and try again.");
            }
        }
        return false;
    }
}
