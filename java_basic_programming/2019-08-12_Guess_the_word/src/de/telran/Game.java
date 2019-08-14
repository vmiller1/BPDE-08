package de.telran;

public class Game {

    private WordRepository wordRepository;
    private WordToGuess wordToGuess;


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
                    informPlayerAboutSuccess(numberOfTries);
                    if (wordToGuess.checkIfGuessed()) {
                        informPlayerAboutWin();
                        playerWon = true;
                    }
                } else {
                    numberOfTries--;
                    informPlayerAboutMistake(numberOfTries);
                }
            }
        }
    }

    private void informPlayerAboutMistake(int numberOfTries) {

    }

    private void informPlayerAboutWin() {

    }

    private void informPlayerAboutSuccess(int numberOfTries) {

    }

    private char askPlayerALetter() {
        return 0;
    }

    private boolean askPlayerLetterOrWord() {
        return false;
    }
}
