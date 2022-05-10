package org.example;

import java.util.Scanner;

public class EvenOddExampleOneIf {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        checkEvenOdd(n);//method calling
    }
    /*
    * method definition  and declaration.
    * this method will check if number is even or not*/
    private static void checkEvenOdd(int number) {
        System.out.println("Number:" + number);
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

}

