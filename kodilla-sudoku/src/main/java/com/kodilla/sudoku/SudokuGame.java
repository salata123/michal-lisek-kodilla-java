package com.kodilla.sudoku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SudokuGame {

    public static void main(String[] args) {
//        SpringApplication.run(SudokuGame.class, args);
        SudokuGameLoop sudokuGameLoop = new SudokuGameLoop();
        sudokuGameLoop.gameLoop();
    }
}