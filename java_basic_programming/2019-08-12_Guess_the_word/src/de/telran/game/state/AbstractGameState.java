package de.telran.game.state;

public abstract class AbstractGameState implements GameState {

    protected int points;
    protected int numberOfTries = 3;
    protected boolean playerWon = false;

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public int getNumberOfTries() {
        return numberOfTries;
    }

    @Override
    public abstract void playerGuessedWordAndWon();

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
        numberOfTries--;
    }

    @Override
    public boolean isGameOn() {
        return numberOfTries > 0 && !playerWon;
    }

    @Override
    public void playerWon() {
        playerWon = true;
    }

    @Override
    public void playerLost() {
        points = 0;
    }

}
