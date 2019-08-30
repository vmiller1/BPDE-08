package de.telran;

import de.telran.game.Game;
import de.telran.game.state.GameState;
import de.telran.game.state.LevelDifficultyEasy;
import de.telran.game.state.LevelDifficultyHard;

import java.util.Scanner;

public class Main {

    /*
    HW:
    implement methods of LevelDifficultyHard:
    - 3 tries
    - if player wins from the 1st try, he gets additionally 500 points
    - if player wins from the 2nd try, he gets additionally 200 points

    - Allow to the user to choose the difficulty level when the game starts
     */

    public static void main(String[] args) {


        System.out.print("Please choose difficulty level (1 - easy, 2 - hard):");
        Scanner scanner = new Scanner(System.in);

        GameState gameState;
        if (scanner.nextInt() == 1) {
            gameState = new LevelDifficultyEasy();
        } else {
            gameState = new LevelDifficultyHard();
        }
        Game game = new Game(gameState);
        game.startNewGame();

    }
}
