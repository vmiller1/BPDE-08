package de.telran;

public class GameState {
    private int points;
    private int numberOfTries = 3;
    private boolean playerWon = false;

    public int getPoints() {
        return points;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public boolean isPlayerWon() {
        return playerWon;
    }

    public GameState() {
    }

    public void playerGuessedWordAndWon() {
        points += 300;
        playerWon = true;
    }

    public void playerGuessedWrongAndLost() {
        numberOfTries = 0;
        points = 0;
    }

    public void guessedLetter() {
        points += 100;
    }

    public void guessedLetterWrong() {
        numberOfTries--;
    }

    public boolean isGameOn() {
        return getNumberOfTries() > 0 && !isPlayerWon();
    }

    public void playerWon() {
        playerWon = true;
    }

    public void playerLost() {
        points = 0;
    }
}