package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGameLoop {
    private SudokuInput sudokuInput = new SudokuInput();
    private SudokuBoard sudokuBoard = new SudokuBoard();
    public void gameLoop() {
        boolean playAgain = true;

        Scanner scanner = new Scanner(System.in);

        while (playAgain) {
            boolean gameFinished = sudokuInput.playerInput(sudokuBoard);

            if (gameFinished) {
                System.out.println("Press 'enter' to play again or type 'EXIT' to quit");

                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    sudokuBoard = new SudokuBoard();
                } else if (input.equalsIgnoreCase("EXIT")) {
                    playAgain = false;
                }
            }
        }

        scanner.close();
    }
}
