package org.example;

public class AdditionExample {
    public static void main(String[] args) {
    System.out.println("Result:"+addition(7,8));
    int sum=addition(5,6);
    String s="Result"+" " +"is" +" "+"very good";
        System.out.println(s);
    }

    public static int addition(int a,int b){
        return a+b;
    }
}
