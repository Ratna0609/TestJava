package org.example;

import java.util.Scanner;

public class EvenOddExample {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scn.nextInt();
        //System.out.println("N:"+n);

        boolean answer=checkEvenOdd(n);//storing o/p of checkEvenOdd() in a boolean variable

        if(answer){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
      }


    private static boolean checkEvenOdd(int number){//return type is boolean on basis of even or odd numbers.
        System.out.println("Number:"+number);
        if(number%2==0){
            return true; //true if number is even
        }else{
            return false; //false if number is odd.
        }
    }
}
