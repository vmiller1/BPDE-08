package de.telran;

import de.telran.table.Table;

public class Main {

    public static void main(String[] args) {
	    Table desk = new Table("white",60,100,120);
	    System.out.println("desk="+desk);

	    Table desk2 = new Table("white",60, 100, 120);
	    System.out.println("desk2=" + desk2);

	    if (desk.equals(desk2))
            System.out.println("desk equals desk2");
        if (desk2.equals(desk))
            System.out.println("desk2 equals desk");

        Table desk3 = new Table("white", 100, 60, 120);

        if (desk.equals(desk3))
            System.out.println("desk equals desk3");

    }
}
