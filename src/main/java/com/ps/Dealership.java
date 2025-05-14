package com.ps;

import java.util.ArrayList;
import java.util.Objects;

public class Dealership {
        private String name;
        private String address;
        private String phone;

        private ArrayList<Vehicle> inventory;

        public Dealership(String name, String address, String phone) {
                this.phone = phone;
                this.address = address;
                this.name = name;
                this.inventory = new ArrayList<>();
        }

        public ArrayList<Vehicle> vehiclesByPrice(double min, double max){
                ArrayList<Vehicle> vehicleMinMaxPrice = new ArrayList<>();
                for (Vehicle v: inventory){
                        if (v.getPrice() >= min & v.getPrice() <= max){
                                vehicleMinMaxPrice.add(v);
                        }
                } return vehicleMinMaxPrice;
        }

        public ArrayList<Vehicle> vehiclesByMakeModel(String name, String model) {
                ArrayList<Vehicle> vehicleMakeModel = new ArrayList<>();
                for (Vehicle v: inventory){
                        if (v.getMake().equalsIgnoreCase(name) & v.getModel().equalsIgnoreCase(model)){
                                vehicleMakeModel.add(v);
                        }
                } return vehicleMakeModel;
        }

        public ArrayList<Vehicle> vehiclesByYear(int min, int max) {
                ArrayList<Vehicle> vehicleYear = new ArrayList<>();
                for (Vehicle v: inventory){
                        if (v.getYear() >= min & v.getYear() <= max){
                                vehicleYear.add(v);
                        }
                } return vehicleYear;
        }
        public ArrayList<Vehicle> vehiclesByColor(String color) {
                ArrayList<Vehicle> vehicleColor = new ArrayList<>();
                for (Vehicle v: inventory){
                        if (v.getColor().equalsIgnoreCase(color)){
                                vehicleColor.add(v);
                        }
                } return vehicleColor;
        }

        public ArrayList<Vehicle> vehiclesByMileage(Double min, Double max) {
                ArrayList<Vehicle> vehicleMileage = new ArrayList<>();
                for (Vehicle v: inventory){
                        if (v.getOdometer() >= min & v.getOdometer() <= max){
                                vehicleMileage.add(v);
                        }
                } return vehicleMileage;
        }

        public ArrayList<Vehicle> vehiclesByType(String vehicleType) {
                ArrayList<Vehicle> vehicleTypeSorted = new ArrayList<>();
                for (Vehicle v: inventory){
                        if (v.getVehicleType().equalsIgnoreCase(vehicleType)){
                                vehicleTypeSorted.add(v);
                        }
                } return vehicleTypeSorted;
        }

        public ArrayList<Vehicle> getAllVehicles(){
                return inventory;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public void addVehicle(Vehicle vehicle) {
                inventory.add(vehicle);
        }

        public void removeVehicle(Vehicle vehicle) {
                inventory.remove(vehicle);
        }

}