package de.telran;

public interface GameState {
    int getPoints();
    int getNumberOfTries();
    void playerGuessedWordAndWon();
    void playerGuessedWrongAndLost();
    void guessedLetter();
    void guessedLetterWrong();
    boolean isGameOn();
    void playerWon();
    void playerLost();
}
