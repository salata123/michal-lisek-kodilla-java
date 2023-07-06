package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        Choices choices = new Choices();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please enter your name: ");
        String playerName = scanner.next();

        while (!end){
            System.out.println(playerName + ", it's your turn. Select '1' for rock, '2' for paper, '3' for scissors, 'x' to end the game, 'n' to start a new game.");
            String playerInput = scanner.next();
            //Starting the game
            if (playerInput.equals("1") || playerInput.equals("2") || playerInput.equals("3")){
                //Player selection confirmation
                choices.choiceConfirmation(playerInput);
                //AI random choice
                choices.aiConfirmation();
                //Player choice vs. AI choice
                choices.result(playerInput, choices.getAiRandomSelection(), choices.getResult()[0], choices.getResult()[1]);
            } else if (playerInput.equals("n")) { //Restarting the game input
                System.out.println("Do You really want to start a new game?");
                playerInput = scanner.next();
                if (playerInput.equals("yes")){
                    choices.restart();
                } else {
                    System.out.println("Let's get back to the game then.");
                    end = false;
                }
            } else if (playerInput.equals("x")) { //Closing the game input
                System.out.println("Do You really want to close the game?");
                 playerInput = scanner.next();
                 if (playerInput.equals("yes")){
                     choices.endGame();
                     end = choices.getEnd();
                 } else {
                     System.out.println("Let's get back to the game then.");
                     end = false;
                 }
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}