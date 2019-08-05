package de.telran;

import de.telran.car.Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setCarPropertiesFromConsole();

        Car truck = new Car();
        truck.setCarPropertiesFromConsole();

        System.out.println(car);
        System.out.println(truck);

        if (car == truck) {
            System.out.println("Car equals truck");
        }

   }
}
