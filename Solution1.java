package org.example.others.solvetheproblem06052022;

import java.util.Scanner;

public class Solution1 {
	/*
	 * 1.Take values of length and breadth of a rectangle from user and 
	 * check if it is square or not.
	 */
	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length and Breadth of a rectangle: ");
		
		int length = in.nextInt();
		int breadth = in.nextInt();
		in.close();
		boolean value=isSquare(length, breadth);
		if(value) {
			System.out.println("Square");
		}else {
			System.out.println("Its Not Square");
		}
}
	public static boolean isSquare(int l,int b){
		if (l == b) {
			return true;
			//System.out.println("Square");
		} else {
			//System.out.println("Its Not Square");
			return false ;
		}
		
	}
	
}
