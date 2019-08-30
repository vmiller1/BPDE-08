package de.telran.game.state;

public class LevelDifficultyEasy extends AbstractGameState {

    @Override
    public void playerGuessedWordAndWon() {
        points += 300;
        playerWon = true;
    }
}