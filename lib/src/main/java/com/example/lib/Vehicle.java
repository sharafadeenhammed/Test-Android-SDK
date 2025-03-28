package com.example.lib;

public abstract class Vehicle {

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
