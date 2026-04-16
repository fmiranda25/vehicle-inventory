package com.pluralsight;

import java.util.Scanner;
//class
public class Vehicle {
    static Scanner input = new Scanner(System.in);
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;
//constructor
    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public static void main(String[] args) {

        String Vehicle[] = {"Ford Explorer", "Toyota Camry", "Chevrolet Malibu", "Honda Civic", "Subaru Outback", "Jeep Wrangler"};
        boolean programIsRunning = true;

        while (programIsRunning) {
            System.out.println("""
                    What do you want to do?
                    1 - List all vehicles
                    2 - Search by make/model
                    3 - Search by price range
                    4 - Search by color
                    5 - Add a vehicle
                    6 - Quit""");

            int command = input.nextInt();
            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel();
                    break;
                case 3:
                    findVehiclesByPrice();
                    break;
                case 4:
                    findVehiclesByColor();
                case 5:
                    addVehicle();
                case 6:
                    quitProgram();
            }
        }
    }
    // At the "Add Vehicle" part, show a string header like these below
    public static void listAllVehicles() {

    }
    public static void findVehiclesByMakeModel() {

    }
    public static void findVehiclesByPrice() {

    }
    public static void findVehiclesByColor() {

    }
    public static void addVehicle() {

    }
    public static void quitProgram() {

    }



    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
