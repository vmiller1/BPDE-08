package de.telran.game.state;

public class LevelDifficultyHard extends AbstractGameState {

    private boolean triedToGuessLetter = false;

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
    public void guessedLetter() {
        super.guessedLetter();
        triedToGuessLetter = true;
    }

    @Override
    public void guessedLetterWrong() {
        super.guessedLetterWrong();
        triedToGuessLetter = true;
    }
}
