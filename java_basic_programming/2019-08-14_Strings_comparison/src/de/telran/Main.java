package de.telran;

public class Main {

    public static void main(String[] args) {
        String apple = "apple";
        String sameApple = apple;
        System.out.println("apple == sameApple:" + (apple == sameApple));

        String anotherApple = new String("apple");
        System.out.println("apple == anotherApple:" + (apple == anotherApple));
        System.out.println("apple.equals(anotherApple):" + (apple.equals(anotherApple)));
    }
}
