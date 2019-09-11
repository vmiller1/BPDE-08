package de.telran.game;

import de.telran.game.word.WordToGuess;

import java.util.Scanner;

public class PlayerInteraction {
    final Scanner scanner;

    public PlayerInteraction() {
        this.scanner = new Scanner(System.in);
    }

    char askPlayerALetter() {
        System.out.print("Please input a letter:");
        return scanner.nextLine().toLowerCase().charAt(0);
    }

    boolean askPlayerLetterOrWord() {
        System.out.print("Word (w) or letter(l)?");
        return scanner.nextLine().toLowerCase().charAt(0) != 'w';
    }

    void informPlayerAboutSuccess(char letter) {
        System.out.println("Success! You've guessed the letter " + letter + "!");
    }

    void informPlayerAboutMistake(char letter) {
        System.out.println("There is no such a letter " + letter + "!");
    }

    void showMaskedWord(String wordWithStars) {
        System.out.println(wordWithStars);
    }

    String askPlayerAWord(Game game) {
        System.out.print("Please input a word:");
        return scanner.nextLine().toLowerCase();
    }

    void informPlayerAboutLose(String word, int points) {
        System.out.println("You lost the game! The word was \""
                + word.toUpperCase()
                + "\"");
        System.out.println("You won " + points + " points");
    }

    void informUserGameStarts(WordToGuess wordToGuess) {
        System.out.println("Guess the word with following meaning");
        System.out.println(wordToGuess.getDescription());
        System.out.println(wordToGuess.getWordWithStars());
    }

    void informPlayerAboutWin(int points) {
        System.out.println("You guessed the word! You won!");
        System.out.println("You won " + points + " points");
    }

    public void informPlayerAboutWrongWord() {
        System.out.println("You entered wrong word!");
    }
}