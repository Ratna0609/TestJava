package org.example;

public class TypeCastingNarrowingExample {
        public static void main(String[] args) {
            // create double type variable
            double num = 10.99;
            System.out.println("The double value: " + num);//10.99

            // convert into int type
            int data = (int) method();
            System.out.println("The integer value: " + data);//1
        }
        static double method(){
            return 1.555;
         }
}
