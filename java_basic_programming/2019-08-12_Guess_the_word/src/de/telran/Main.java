package de.telran;

public class Main {

    public static void main(String[] args) {

        /*WordToGuess wordToGuess = new WordToGuess("apple", "Fruit");
        System.out.println(wordToGuess);
        System.out.println(wordToGuess.getWordWithStars());
        wordToGuess.openLetter('p');
        System.out.println(wordToGuess.getWordWithStars());
        wordToGuess.openLetter('e');
        System.out.println(wordToGuess.getWordWithStars());
        wordToGuess.openLetter('z');
        System.out.println(wordToGuess.getWordWithStars());
        wordToGuess.openWord("apple");
        System.out.println(wordToGuess.getWordWithStars());*/

        WordRepository wordRepository = new WordRepository();
        System.out.println(wordRepository.getRandomWord());
        System.out.println(wordRepository.getRandomWord());
        System.out.println(wordRepository.getRandomWord());
        System.out.println(wordRepository.getRandomWord());
        System.out.println(wordRepository.getRandomWord());
    }
}
