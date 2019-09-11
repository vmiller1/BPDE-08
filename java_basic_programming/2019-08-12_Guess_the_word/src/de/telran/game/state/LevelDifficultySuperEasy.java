package de.telran.game.state;

public class LevelDifficultySuperEasy extends AbstractGameState {

    private int numberOfTriesToGuessWord = 2;

    public LevelDifficultySuperEasy() {
        super();
        numberOfTries = 5;
    }

    @Override
    public void playerGuessedWrong() {
        numberOfTriesToGuessWord--;
        if (numberOfTriesToGuessWord == 0)
            playerLost();
    }

    @Override
    public void playerGuessedWordAndWon() {
        playerWon = true;
        points += 100;
    }
}
