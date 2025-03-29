package com.example.lib;

import java.util.Scanner;

public class Exercise1 {


    public static void main (String[] args){
        //inputDivisionAndRemainder();
        //circleAreaAndPerimeter();
        //integerToBinary();
        //stringInputCharacterCounter();
        //reverseString();
        //multiplyArrayWithCorrespondingItem();
        //countEvenAndOddNumbersInArray();
        //drawPyramid();
        squareMartrixAdder();
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

    static void circleAreaAndPerimeter(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the circle radius...\n");
        int radius = in.nextInt();
        double perimeter = (double) 2 * Math.PI * radius;
        double area = (double) Math.PI * radius * radius;
        System.out.println("area of circle = " + area);
        System.out.println("perimeter of circle = " + perimeter );
    }

    static void integerToBinary(){
        Scanner in = new Scanner(System.in);
        int dec_num, quotient, i =1, j;
        int bin_num[] = new int[100];
        System.out.println("enter the decimal number");
        dec_num = in.nextInt();
        quotient = dec_num;
        while(quotient != 0){
            bin_num[i++] = quotient%2;
            quotient = quotient/2;
        }
        System.out.println("the binary of " + dec_num + "is: ");
        for(j = i-1; j>0; j--) System.out.println(bin_num[j]);

    }

    static void stringInputCharacterCounter(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String you want to count: ");
        String inputStrings = in.nextLine();

        System.out.println("total input count : "+inputStrings.length());
        char[] inputStringArray = inputStrings.toCharArray();
        int letters =0, spaces = 0, numbers =0, others =0;
        for(char character: inputStringArray){
            if(Character.isLetter(character))letters++;
            else if(Character.isSpaceChar(character))spaces++;
            else if(Character.isDigit(character))numbers++;
            else others++;
        }
        System.out.println("letters count: "+letters);
        System.out.println("spaces count: "+spaces);
        System.out.println("numbers count: "+numbers);
        System.out.println("others characters count: "+others);
    }

    static void reverseString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String you want to reverse: ");
        String inputStrings = in.nextLine();
        char[] inputStringArray = inputStrings.toCharArray();
        String reversedString = "";
        // reverse string
        for(int i = inputStrings.length() -1; i>=0; i-- )reversedString += inputStringArray[i];
        System.out.println("the revesed string is :  "+reversedString);
    }

    static void multiplyArrayWithCorrespondingItem(){
        int firstNumberArray[] = {1,2,3,4};
        int secondNumberArray[] = {1,2,3,4};
        int result[] = new int[4];
        for(int index = 0; index<firstNumberArray.length; index++){
            result[index] = firstNumberArray[index] * secondNumberArray[index];
        }
        System.out.println("result of multiplication is :");
        for(int number:result) System.out.print(""+number+" ");
    }

    static void countEvenAndOddNumbersInArray(){
        int numbers[] = {1,3,4,5,6,7,8,9,10,11};
        int evenNumbers = 0, oddNumbers =0;
        for(int number: numbers){
            if(number%2 == 0) evenNumbers++;
            else oddNumbers++;
        }
        System.out.println("odd numbers count is: "+ oddNumbers);
        System.out.println("even numbers count is: "+evenNumbers);
    }
    static void drawPyramid(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of rows to draw...");
        int rows = in.nextInt();
        int rowSpaces = rows*2 -1;
        for(int i = 1; i <= rows; i++){
            int count = 0;
            for(int spaces= rowSpaces; spaces!=0; spaces--) System.out.print(" ");
            for(int timesToPrint = 1; timesToPrint<= i; timesToPrint++) System.out.print(i+" ");
            System.out.println();
            rowSpaces--;
        }
    }

    static void squareMartrixAdder(){
        Scanner in = new Scanner(System.in);
        int matrix1[][] = new int [3][3];
        int matrix2[][] = new int[3][3];
        int matrixAdditionResult[][] = new int[3][3];
        // fill up matrix one
        for(int matrixRowIndex = 0; matrixRowIndex < matrix1.length; matrixRowIndex++ ){
            for(int matrixColumnIndex = 0; matrixColumnIndex<matrix1[matrixRowIndex].length; matrixColumnIndex++ ){
                System.out.print("enter the value for matrix1 at position "+matrixRowIndex +"," +matrixColumnIndex);
                matrix1[matrixRowIndex][matrixColumnIndex] = in.nextInt();
            }
        }
        // fill up matrix two
        for(int matrixRowIndex = 0; matrixRowIndex < matrix2.length; matrixRowIndex++ ){
            for(int matrixColumnIndex = 0; matrixColumnIndex<matrix2[matrixRowIndex].length; matrixColumnIndex++ ){
                System.out.print("enter the value for matrix2 at position "+matrixRowIndex +"," +matrixColumnIndex);
                matrix2[matrixRowIndex][matrixColumnIndex] = in.nextInt();
            }
        }
        // add matrix
        for(int matrixRowIndex = 0; matrixRowIndex < matrixAdditionResult.length; matrixRowIndex++ ){
            for(int matrixColumnIndex = 0; matrixColumnIndex<matrixAdditionResult[matrixRowIndex].length; matrixColumnIndex++ ){
                matrixAdditionResult[matrixRowIndex][matrixColumnIndex] = matrix1[matrixRowIndex][matrixColumnIndex] + matrix2[matrixRowIndex][matrixColumnIndex];
            }
        }
        // print result
        System.out.println("result of addition of matrix: ");
        for(int matrixRowIndex = 0; matrixRowIndex < matrixAdditionResult.length; matrixRowIndex++ ){
            for(int matrixColumnIndex = 0; matrixColumnIndex<matrixAdditionResult[matrixRowIndex].length; matrixColumnIndex++ ){
                //System.out.println("value for matrix1 at position "+matrixRowIndex +"," +matrixColumnIndex +" = "+ matrixAdditionResult[matrixRowIndex][matrixColumnIndex] );
                System.out.print(matrixAdditionResult[matrixRowIndex][matrixColumnIndex] + " " );
            }
            System.out.println();

        }

    }
}
