package org.example.others.solvetheproblem06052022;

import java.util.Scanner;

public class Solution4 {
	/*
	 * 4.Write a program to check whether a entered character is lowercase ( a to z) or uppercase ( A to Z ). 
	 * (hint use ascii value concept for this and type casting)
	 */
	public static void main(String[] args) {
		 /*Scanner in = new Scanner(System.in);
		 System.out.println("Enter a Character between a to z: "); 
		 char ch=in.next().charAt(0);
		 in.close();
		 */
			
		//Check given charecter is Lowercase /Uppercase ?
		char ch='R';
		int asciiVal=(int)ch;
		CharUpperLower(ch);

		System.out.println("ASCII value : "+asciiVal);
		AsciiUpperLower(asciiVal);

	}

	private static void AsciiUpperLower(int asciiVal) {
		if (asciiVal >= 65 && asciiVal < 91) {
		System.out.println("Character is Uppercase");
		}else if(asciiVal>=97 && asciiVal<123){
			System.out.println("Character is Lowercase");
		}
	}

	private static void CharUpperLower(char ch) {
		if(Character.isUpperCase(ch)) {
			System.out.println("Character is Uppercase");
		}else {
			System.out.println("Character is Lowercase");
		}
	}

}
