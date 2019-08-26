package de.telran;

public class LevelDifficulty2 implements GameState {

    private int points;
    private int numberOfTries = 1;
    private boolean playerWon = false;

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public int getNumberOfTries() {
        return numberOfTries;
    }

    @Override
    public void playerGuessedWordAndWon() {
        // TODO write new implementation
    }

    @Override
    public void playerGuessedWrongAndLost() {
        numberOfTries = 0;
        points = 0;
    }

    @Override
    public void guessedLetter() {
        points += 100;
    }

    @Override
    public void guessedLetterWrong() {
        //TODO write new implementation
    }

    @Override
    public boolean isGameOn() {
        return numberOfTries > 0 && !playerWon;
    }

    @Override
    public void playerWon() {
        // TODO new implementation
    }

    @Override
    public void playerLost() {
        points = 0;
    }
}
