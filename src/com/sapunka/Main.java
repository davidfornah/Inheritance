package com.sapunka;
public class Main {
//SINGLE LEVEL INHERITANCE PROGRAM
    public static void main(String[] args) {
	class Vehicle{
	    void drive(){
            System.out.println("\nPLEASE PRINT OUT THE TYPE OF VEHICLE YOU CAN USE");
            System.out.println("Vehicle car, can you drive a car?");
        }
    }
    class Bike extends Vehicle{
	    void ride(){
            System.out.println("Vehicle bike, can you ride a bike?\n");
        }
    }
    Vehicle vehicle = new Vehicle();
	vehicle.drive();
	Bike bike = new Bike();
	bike.ride();
    }
}
