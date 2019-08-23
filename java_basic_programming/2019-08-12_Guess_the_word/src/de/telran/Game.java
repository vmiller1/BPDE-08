package de.telran;

public class Game {

    private final GameState gameState = new GameState();
    private final PlayerInteraction playerInteraction = new PlayerInteraction();

    private WordRepository wordRepository;
    private WordToGuess wordToGuess;


    public Game() {
        wordRepository = new WordRepository();
    }

    public void startNewGame() {

        Word word = wordRepository.getRandomWord();
        wordToGuess = new WordToGuess(word.getWord(), word.getDescription());
        playerInteraction.informUserGameStarts(wordToGuess);

        while (gameState.isGameOn()) {
            if (playerInteraction.askPlayerLetterOrWord())
                sayLetter();
            else
                sayWord();
        }
    }

    private void sayWord() {
        String wordFromPlayer = playerInteraction.askPlayerAWord(this);
        if (wordToGuess.getWord().equals(wordFromPlayer)) {
            gameState.playerGuessedWordAndWon();
            informPlayerAboutWin();
        } else {
            gameState.playerGuessedWrongAndLost();
            playerInteraction.informPlayerAboutLose(wordToGuess.getWord(),gameState.getPoints());
        }
    }

    private void sayLetter() {
        char letterFromPlayer = playerInteraction.askPlayerALetter();
        if (wordToGuess.hasChar(letterFromPlayer)) {
            gameState.guessedLetter();
            wordToGuess.openLetter(letterFromPlayer);
            playerInteraction.informPlayerAboutSuccess(letterFromPlayer);
            printNumberOfTriesAndPoints(gameState.getNumberOfTries());
            playerInteraction.showMaskedWord(wordToGuess.getWordWithStars());
            if (wordToGuess.checkIfGuessed()) {
                informPlayerAboutWin();
                gameState.setPlayerWon(true);
            }
        } else {
            gameState.guessedLetterWrong();
            playerInteraction.informPlayerAboutMistake(letterFromPlayer);
            printNumberOfTriesAndPoints(gameState.getNumberOfTries());
            playerInteraction.showMaskedWord(wordToGuess.getWordWithStars());
            if (gameState.getNumberOfTries() == 0) {
                gameState.setPoints(0);
                playerInteraction.informPlayerAboutLose(wordToGuess.getWord(), gameState.getPoints());
            }
        }
    }

    private void informPlayerAboutWin() {
        System.out.println("You guessed the word! You won!");
        System.out.println("You won " + gameState.getPoints() + " points");
    }

    private void printNumberOfTriesAndPoints(int numberOfTries) {
        System.out.println("Your number of tries is " + numberOfTries);
        System.out.println("Your number of points is " + gameState.getPoints());
    }
}
