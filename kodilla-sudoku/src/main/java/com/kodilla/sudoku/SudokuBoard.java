package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard implements Cloneable{
    private List<SudokuRow> board;

    public SudokuBoard(){
        board = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            board.add(new SudokuRow());
        }
    }

    @Override
    public String toString() {
        StringBuilder boardToString = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == 0){
                boardToString.append("  1  2  3   4  5  6   7  8  9").append("\n");
            }

            boardToString.append(i + 1).append(board.get(i)).append("\n");

            if (i == 2 || i == 5) {
                boardToString.append("----------+---------+---------").append("\n");
            }
        }
        return boardToString.toString();
    }

    public void putNumber(int x, int y, int number){
        board.get(x).getElementsList().get(y).setValue(number);
    }

    public List<SudokuRow> getBoard() {
        return board;
    }
    public SudokuRow getRow(int row){
        return board.get(row);
    }

    @Override
    public SudokuBoard clone(){
        SudokuBoard clonedBoard = new SudokuBoard();
        for(int i = 0; i < 9; i++){
            clonedBoard.board.set(i, this.board.get(i).clone());
        }
        return clonedBoard;
    }

}
