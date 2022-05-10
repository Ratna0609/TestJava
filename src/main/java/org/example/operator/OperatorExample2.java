package org.example;

public class OperatorExample2 {
    public static void main(String args[]) {
        int j = 20, i = 0;
        j = i++ + i++ + ++i + i-- + j++ + i--;
         //   0      1      3    3    20    2
        System.out.print("value of j:" + j);//29//21//48
        System.out.print("value of i:" + i);//1//29//1
    }
}