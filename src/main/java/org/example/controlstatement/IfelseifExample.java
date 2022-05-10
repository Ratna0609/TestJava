package org.example;

public class IfelseifExample {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=5;
        if(a==b){
            System.out.println("a is bigger");//no
        }else if(b==a) {
            System.out.println("b is bigger");//yes
        }else if(a>c){
            System.out.println("both are equal");//no
        }else{
            System.out.println("No need to compare");//no
        }

        
    }
}
