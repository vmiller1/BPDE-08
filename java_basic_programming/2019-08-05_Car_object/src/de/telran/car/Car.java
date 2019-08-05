package de.telran.car;


/*
- type
- manufacturer
- model
- color
- power
- productionDate
- price
 */

import java.util.Scanner;

public class Car {

    private String type;
    private String manufacturer;
    private String model;
    private String color;
    private String power;
    private String productionDate;
    private int price;

    public Car() {
    }

    public Car(String type) {
        this.type = type;
    }

    public Car(String type, String manufacturer) {
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public void setCarPropertiesFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter type of the car:");
        this.setType(scanner.nextLine());

        System.out.print("Please enter manufacturer of the car:");
        this.setManufacturer(scanner.nextLine());

        System.out.print("Please enter model:");
        this.setModel(scanner.nextLine());

        System.out.print("Please enter color:");
        this.setColor(scanner.nextLine());

        System.out.print("Please enter power:");
        this.setPower(scanner.nextLine());

        System.out.print("Please enter production date:");
        this.setProductionDate(scanner.nextLine());

        System.out.print("Please enter price:");
        this.setPrice(scanner.nextInt());
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power='" + power + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", price=" + price +
                '}';
    }
}
