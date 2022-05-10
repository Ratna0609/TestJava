package org.example;

public class OperatorExample {
    public static void main(String args[]){
        int j=0,i=0;
        int x = 0;
        j=i++ +i++ + ++i +i-- + x + j++ + i-- ;
        System.out.print("value of j:"+j);//9
        System.out.print("value of i:"+i);//1
    }
}
