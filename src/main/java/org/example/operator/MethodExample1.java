package org.example;

public class MethodExample1 {
    public static void main(String[] args) {
        MethodExample1 methodExample1=new MethodExample1();
        methodExample1.test();

    }

     void test(){
        System.out.println("inside method test");
        test1();
    }

     void test1(){
        System.out.println("inside method test1");
        test2();
    }

     void test2(){
        System.out.println("inside method test2");
    }

}
