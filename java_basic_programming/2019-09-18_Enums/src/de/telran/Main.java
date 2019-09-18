package de.telran;

public class Main {

    public static void main(String[] args) {

        for (Level level: Level.values()) {
            System.out.println(level);
        }

        Level level = Level.valueOf("LOW");
        System.out.println("Level=" + level);
        System.out.println("Level code = " + level.getLevelCode());

        System.out.print(Level.getLevelByLevelCode(3));
    }
}
