package com.kodilla.rps;

import java.util.Random;

public class Choices {
    Random random = new Random();
    private String aiRandomSelection;
    private int[] result = new int[2];
    private boolean end = false;
    public int[] getResult() {
        return result;
    }

    public String getAiRandomSelection() {
        return aiRandomSelection;
    }

    public boolean getEnd() {
        return end;
    }

    public void choiceConfirmation(String playerChoice){
            if (playerChoice.equals("1")){
                System.out.println("You chose rock");
            } else if (playerChoice.equals("2")){
                System.out.println("You chose paper");
            } else {
                System.out.println("You chose scissors");
            }
    }

    public String aiConfirmation() {
        aiRandomSelection = String.valueOf(random.nextInt(3) + 1);
        if (aiRandomSelection.equals("1") || aiRandomSelection.equals("2") || aiRandomSelection.equals("3")) {
            //Player selection confirmation
            if (aiRandomSelection.equals("1")) {
                System.out.println("AI chose rock");
            } else if (aiRandomSelection.equals("2")) {
                System.out.println("AI chose paper");
            } else {
                System.out.println("AI chose scissors");
            }
        }
        return aiRandomSelection;
    }

    public int[] result(String playerInput, String aiRandomSelection, int playerWinCounter, int aiWinCounter) {
        if (aiRandomSelection.equals(playerInput)) {
            System.out.println("Draw.");
        } else if (playerInput.equals("1") && aiRandomSelection.equals("3")) {
            System.out.println("You win! Rock beats scissors.");
            playerWinCounter++;
        } else if (playerInput.equals("2") && aiRandomSelection.equals("1")) {
            System.out.println("You win! Paper beats rock.");
            playerWinCounter++;
        } else if (playerInput.equals("3") && aiRandomSelection.equals("2")) {
            System.out.println("You win! Scissors beat paper.");
            playerWinCounter++;
        } else {
            System.out.println("AI wins!");
            aiWinCounter++;
        }

        result[0] = playerWinCounter;
        result[1] = aiWinCounter;

        System.out.println("Player score: " + result[0]);
        System.out.println("AI score: " + result[1]);

        return result;
    }

    public int[] restart(){
        System.out.println("Restarting the game and erasing the score.");
        result[0] = 0;
        result[1] = 0;
        return result;
    }

    public boolean endGame(){
        System.out.println("Thank You for playing! The final score is: ");
        System.out.println("Your score: " + getResult()[0]);
        System.out.println("AI score: " + getResult()[1]);
        return end = true;
    }
}
