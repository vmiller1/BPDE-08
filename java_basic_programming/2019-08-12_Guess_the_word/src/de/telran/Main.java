package de.telran;

public class Main {

    /*
    HW:
    implement methods of LevelDifficulty2:
    - 3 tries
    - if player wins from the 1st try, he gets additionally 500 points
    - if player wins from the 3nd try, he gets additionally 200 points

    - Allow to the user to choose the difficulty level when the game starts
     */

    public static void main(String[] args) {

        GameState gameState = new GameStateImpl();
        Game game = new Game(gameState);
        game.startNewGame();
    }
}
