package de.telran;

import de.telran.game.Game;
import de.telran.game.state.AbstractGameState;
import de.telran.game.state.GameState;
import de.telran.game.state.LevelDifficultyEasy;
import de.telran.game.state.LevelDifficultyHard;

import java.util.Scanner;

public class Main {

    /*
    HW:
    implement new difficulty level LevelDifficultySuperEasy:
    - 2 tries to guess a word
    - 5 tries to make a mistake with letter
    - 3 guessed letters in a row  - +300 points

    Add validation and error message if user enters difficulty level
    that does not exist. Retry to enter the difficulty level.

    Possible features:
    - open any letter in the word
    - random number of points from predefined list (50, 100, 200, 300)
    - if there is more then 1 same guessed letter in the word,
    multiply points by number of the same guessed letters
     */

    public static void main(String[] args) {

        System.out.print("Please choose difficulty level (1 - easy, 2 - hard):");
        Scanner scanner = new Scanner(System.in);

        GameState gameState = null;

        while (gameState == null) {
            switch (scanner.nextInt()) {
                case 1:
                    gameState = new LevelDifficultyEasy();
                    break;
                case 2:
                    gameState = new LevelDifficultyHard();
                    break;
                default:
                    System.out.println("You entered the wrong difficulty level. Please try again.");
            }
        }

        Game game = new Game(gameState);
        game.startNewGame();

    }
}
