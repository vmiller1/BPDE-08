package de.telran;

import java.io.IOException;

import static de.telran.FileUtils.copyBinFile;
import static de.telran.FileUtils.copyTextFile;

public class Main {

    public static void main(String[] args) throws IOException {
        //copyBinFile("hello_word.txt", "hello_world.txt");
        copyTextFile("hello_word.txt", "hello_world2.txt");

    }
}
