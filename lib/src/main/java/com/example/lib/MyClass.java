package com.example.lib;

public class MyClass {

    //    main method
    public static void main(String[] args){
        sayHello();
        int sum = addNumbers(5, 5);
        System.out.println("total sum of numbers: "+ sum);
        int maxValue = findMaxValue(new int[]{ 5, 8, 3, 12, 7, 80, 600, 34});
        System.out.println("maximum number in array is :"+ maxValue);

    }

    static void sayHello(){
        System.out.println("hello my friends...");
    }
    static int addNumbers(int x, int y){return x +y;}
    static double addNumbers(double x, double y){return x+y;}
    static int findMaxValue(int[] numbers){
        for(int currentValue : numbers){
            // compare currentValue at index with each item in array
            for(int compareIndex = 0; compareIndex < numbers.length; compareIndex++){
                if(currentValue < numbers[compareIndex]) break;
                if(compareIndex == numbers.length -1) return currentValue;
            }
            // end of inner for loop
        }
        return  0;
    }




}