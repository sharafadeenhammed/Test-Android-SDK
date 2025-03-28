package com.example.lib;

import java.awt.SystemTray;

public class Car implements VehicleInterface {

     int speed;
     int year;

     String carModel;

    void start() {
        System.out.println("The Car Started...");
    }

    @Override
    public void accelerate(){
        speed += 10;
        System.out.println("your new speed is :" + speed);
    }

    @Override
    public void brake (){
        speed -= 5;
        System.out.println("Applying mechanical brake new speed is :" + speed);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starts...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stoped...");
    }

    void honk(){
        System.out.println("beep!!! beep!!!");
    }

    public Car(int carSpeed, int carYear, String model){
        //super(4);
        speed = carSpeed;
        year = carYear;
        carModel = model;
    }

    //@Override
    //void stop() {System.out.println("The Cars Stops...");}
}
