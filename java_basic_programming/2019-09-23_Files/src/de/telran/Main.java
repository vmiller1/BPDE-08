package de.telran;

import java.io.IOException;

import static de.telran.FileUtils.copyBinFile;

public class Main {

    public static void main(String[] args) throws IOException {
        copyBinFile("hello_word.txt", "hello_world.txt");
    }
}
