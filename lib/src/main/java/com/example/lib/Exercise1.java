package com.example.lib;

import java.util.Scanner;

public class Exercise1 {


    public static void main (String[] args){
        inputDivisionAndRemainder();
    }

    static void inputDivisionAndRemainder (){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number...\n");
        int n1 = in.nextInt();
        System.out.println("enter the second number...\n");
        int n2 = in.nextInt();
        double division = (double) n1/n2;
        int remainder = n1%n2;
        System.out.println("n1/m2 = "+division);
        System.out.println("remainder of n1/n2 = "+ remainder);
    }
}
