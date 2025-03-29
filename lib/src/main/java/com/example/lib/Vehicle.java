package com.example.lib;

public abstract class Vehicle {

    public static final int MAX_NUMBER_OF_WHEELS = 50;
    int numbersOfWheels;
    public Vehicle(int numbersOfWheels){
        this.numbersOfWheels = numbersOfWheels;
    }

    void start (){
        System.out.println("Vehicle Start..");
    }

    abstract void stop();
    abstract void brake();
}
