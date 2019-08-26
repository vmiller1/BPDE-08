package de.telran;

public class GameStateImpl implements GameState {
    private int points;
    private int numberOfTries = 3;
    private boolean playerWon = false;

    public int getPoints() {
        return points;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public GameStateImpl() {
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
        return numberOfTries > 0 && !playerWon;
    }

    public void playerWon() {
        playerWon = true;
    }

    public void playerLost() {
        points = 0;
    }
}