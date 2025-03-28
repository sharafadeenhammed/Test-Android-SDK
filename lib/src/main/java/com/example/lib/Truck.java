package com.example.lib;

public class Truck extends Vehicle implements VehicleInterface{

    public Truck(){
        super(10);
    }

    @Override
    void stop() {
        System.out.println("The Truck Stops...");
    }

    @Override
    public void startEngine() {
        System.out.println("Truck Engine Started...");
    }

    @Override
    public void stopEngine() {
    System.out.println("Truck Engine Shutdown...");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Applying Hydraulic brake...");
    }

    void start(){
        System.out.println("Truck Started...");
    }
}
