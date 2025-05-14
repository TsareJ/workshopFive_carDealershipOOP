package com.ps;

import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Dealership dealership; // = new Dealership();
    private final Scanner scanner = new Scanner(System.in);

    private void init(){
        dealership = DealershipFileManager.getDealership();
        // Load Dealership details from File (Read from file)
        // switch(){ then load each method by case
    }

    public UserInterface(){
        init();
    }

    public void display(){
        // Create main menu with do while loop
        int mainMenuCommand;

        do{
            System.out.println("Welcome to Tsare's JDM & Supercar Dealership");
            System.out.println("1. Sort by Price");
            System.out.println("2. Sort by Make & Model");
            System.out.println("3. Sort by Year");
            System.out.println("4. Sort by Color ");
            System.out.println("5. Sort by Mileage");
            System.out.println("6. Sort by Vehicle Type");
            System.out.println("7. Display All Vehicles");
            System.out.println("8. Add Vehicle");
            System.out.println("9. Remove Vehicle");
            System.out.println("0. Exit Dealership");

            System.out.println("Command: ");
            mainMenuCommand = scanner.nextInt();
            scanner.nextLine();

            switch (mainMenuCommand){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Exiting now...");
                    break;
                default:
                    System.out.println("Invalid command please try again!");

            }

        } while(mainMenuCommand !=0);
    }

    private void processGetByPriceRequest(){
        System.out.println("Displaying Price sorted Vehicles");
        System.out.print("Min Price: ");
        Double min = scanner.nextDouble();

        System.out.print("Max Price: ");
        Double max = scanner.nextDouble();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByPrice(min,max);
        displayVehicles(filteredVehicles);
    }
    private void processGetByMakeModelRequest(){
        System.out.println("Displaying Vehicles by Make & Model");
        System.out.println("Enter Make: ");
        String make = scanner.nextLine();

        System.out.println("Enter Model: ");
        String model = scanner.nextLine();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByMakeModel(make,model);
        displayVehicles(filteredVehicles);
    }
    private void processGetByYearRequest(){
        System.out.println("Displaying Vehicles sorted by Year");
        System.out.print("Min Year: ");
        int min = scanner.nextInt();

        System.out.print("Max Year: ");
        int max = scanner.nextInt();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByYear(min,max);
        displayVehicles(filteredVehicles);

    }
    private void processGetByColorRequest(){
        System.out.println("Displaying Vehicles by Color");
        System.out.println("Enter Color: ");
        String make = scanner.nextLine();

        String color = "";
        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByColor(color);
        displayVehicles(filteredVehicles);

    }
    private void processGetByMileageRequest(){
        System.out.println("Displaying Vehicles by Mileage");
        System.out.print("Min Mileage: ");
        Double min = scanner.nextDouble();

        System.out.print("Max Mileage: ");
        Double max = scanner.nextDouble();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByMileage(min,max);
        displayVehicles(filteredVehicles);

    }
    private void processGetByVehicleTypeRequest(){
        System.out.println("Displaying Vehicles by Type/Body Style");
        System.out.println("Enter Body Style: ");
        String make = scanner.nextLine();

        String vehicleType = new String();
        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByType(vehicleType);
        displayVehicles(filteredVehicles);

    }
    private void processGetAllVehiclesRequest(){
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        System.out.println("Displaying all Vehicles!");
        displayVehicles(vehicles);

    }
    private void processAddVehicleRequest(){
        System.out.println("Enter a Vehicle you would like to add!");


    }
    private void processRemoveVehicleRequest(){


    }

    public static void displayVehicles(ArrayList<Vehicle> vehicles){
        for(Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
