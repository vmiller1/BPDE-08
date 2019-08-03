package de.telran;

import de.telran.computer.Computer;

public class Main {

    public static void main(String[] args) {
	    Computer laptop = new Computer("Lenovo", "T480s", "Intel");
	    System.out.println(laptop.toString());
        System.out.println();
	    laptop.setDiscType("SSD");
	    System.out.println(laptop);
        System.out.println();
	    laptop.setDiscType("Vasya");
        System.out.println(laptop);
        System.out.println();
        System.out.println(laptop.getDiscType());
        System.out.println();
        laptop.printParameters();


    }
}
