package de.telran.game.state;

public class LevelDifficultyHard implements GameState {

    private int points;
    private int numberOfTries = 3;
    private boolean playerWon = false;

    private boolean triedToGuessLetter = false;

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
        playerWon = true;
        points +=300;
        if (!triedToGuessLetter)
            points += 500;
        if (numberOfTries == 2)
            points += 200;
    }

    @Override
    public void playerGuessedWrongAndLost() {
        numberOfTries = 0;
        points = 0;
    }

    @Override
    public void guessedLetter() {
        points += 100;
        triedToGuessLetter = true;
    }

    @Override
    public void guessedLetterWrong() {
        triedToGuessLetter = true;
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
