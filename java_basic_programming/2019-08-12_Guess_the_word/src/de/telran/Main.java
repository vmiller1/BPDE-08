package de.telran;

public class Main {

    public static void main(String[] args) {

        Word word = new Word("apple", "Fruit");
        System.out.println(word);
        System.out.println(word.getWordWithStars());
        word.openLetter('p');
        System.out.println(word.getWordWithStars());
        word.openLetter('e');
        System.out.println(word.getWordWithStars());
        word.openLetter('z');
        System.out.println(word.getWordWithStars());
        word.openWord("apple");
        System.out.println(word.getWordWithStars());
    }
}
