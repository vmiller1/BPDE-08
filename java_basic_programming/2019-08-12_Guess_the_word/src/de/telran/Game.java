package de.telran;

import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);

    private WordRepository wordRepository;
    private WordToGuess wordToGuess;

    private int points;


    public Game() {
        wordRepository = new WordRepository();
    }

    public void startNewGame() {

        Word word = wordRepository.getRandomWord();
        wordToGuess = new WordToGuess(word.getWord(), word.getDescription());
        System.out.println("Guess the word with following meaning");
        System.out.println(wordToGuess.getDescription());
        System.out.println(wordToGuess.getWordWithStars());

        int numberOfTries = 3;
        boolean playerWon = false;

        while (numberOfTries > 0 && !playerWon) {
            if (askPlayerLetterOrWord()) {
                //letter
                char letterFromPlayer = askPlayerALetter();
                if (wordToGuess.hasChar(letterFromPlayer)) {
                    wordToGuess.openLetter(letterFromPlayer);
                    informPlayerAboutSuccess(letterFromPlayer);
                    printNumberOfTries(numberOfTries);
                    showMaskedWord(wordToGuess.getWordWithStars());
                    if (wordToGuess.checkIfGuessed()) {
                        informPlayerAboutWin();
                        playerWon = true;
                    }
                } else {
                    numberOfTries--;
                    informPlayerAboutMistake(letterFromPlayer);
                    printNumberOfTries(numberOfTries);
                    showMaskedWord(wordToGuess.getWordWithStars());
                    if (numberOfTries == 0)
                        informPlayerAboutLose(wordToGuess.getWord());
                }
            } else {
                //word
                String wordFromPlayer = askPlayerAWord();
                if (wordToGuess.getWord().equals(wordFromPlayer)) {
                    informPlayerAboutWin();
                    playerWon = true;
                } else {
                    informPlayerAboutLose(wordToGuess.getWord());
                    numberOfTries = 0;
                }
            }
        }
    }

    private String askPlayerAWord() {
        System.out.print("Please input a word:");
        return scanner.nextLine().toLowerCase();
    }

    private void informPlayerAboutLose(String word) {
        System.out.println("You lost the game! The word was \""
                + word.toUpperCase()
                + "\"");
    }

    private void showMaskedWord(String wordWithStars) {
        System.out.println(wordWithStars);
    }

    private void informPlayerAboutMistake(char letter) {
        System.out.println("There is no such a letter " + letter + "!");
    }

    private void informPlayerAboutWin() {
        System.out.println("You guessed the word! You won!");
    }

    private void informPlayerAboutSuccess(char letter) {
        System.out.println("Success! You've guessed the letter " + letter + "!");
    }

    private void printNumberOfTries(int numberOfTries) {
        System.out.println("Your number of tries is " + numberOfTries);
    }

    private char askPlayerALetter() {
        System.out.print("Please input a letter:");
        return scanner.nextLine().toLowerCase().charAt(0);
    }

    private boolean askPlayerLetterOrWord() {
        return true;
    }
}
