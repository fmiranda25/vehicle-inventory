package com.pluralsight;

import java.util.Scanner;

public class Program {

    static Scanner input = new Scanner(System.in);
    static Vehicle[] vehicles = new Vehicle[20];

    public static void main(String[] args) {

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

//        for (Vehicle vehicle : vehicles) {
//            System.out.println(vehicle);
//        }


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
                    System.out.println("Have a nice day.");
                    programIsRunning = false;
                    quitProgram();
            }

// At the "Add Vehicle" part, show a string header like these below


        }
    }
    public static void listAllVehicles (Vehicle[] vehicles) {
        for (int index = 0; index <= vehicles.length; index++) {
            if (vehicles != null) {

            }
        }

        }


    public static void findVehiclesByMakeModel () {

    }
    public static void findVehiclesByPrice () {

    }
    public static void findVehiclesByColor () {

    }
    public static void addVehicle () {

    }
    public static void quitProgram () {

    }

}