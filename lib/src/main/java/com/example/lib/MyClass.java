package com.example.lib;

public class MyClass {

    //main method
    public static void main(String[] args){
        Car car = new Car(100, 2023, "C 300");
        Truck truck = new Truck();
        car.startEngine();
        car.stopEngine();
        car.brake();
        truck.startEngine();
        truck.stopEngine();
    }

}
