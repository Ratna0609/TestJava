package org.example.others.solvetheproblem06052022;

import java.util.Scanner;

public class Solution2 {
//* 2.Take two int values from user and print greatest among them. 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integer Values: ");
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		MinMax(a, b);
	}

	private static void MinMax(int a, int b) {
		if (a > b) {
			System.out.println(a + " is greaterthan " + b);
		} else if (b > a) {
			System.out.println(b + " is greaterthan " + a);
		} else {
			System.out.println("a and b are equal");
		}

	}

}
