package org.example.others.solvetheproblem06052022;

import java.util.Scanner;

public class Solution3 {
	 // 3.Take input of age of 3 people by user and determine oldest and youngest among them.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first person age: ");
		int a = in.nextInt();
		System.out.println("Enter the second person age: ");
		int b = in.nextInt();
		System.out.println("Enter the third person age: ");
		int c= in.nextInt();
		in.close();
		FindbyAge(a,b,c);
		 /*
			 * else if(a<b && a<c) { System.out.println( "a is youngerthan b and c" ); }else
			 * if (b < a && b<c) { System.out.println("b is youngerthan  a and c"); }else if
			 * (c< a && c<b) { System.out.println("c is youngest  "); }
			 */
		

	}

	private static void FindbyAge(int a, int b, int c) {

		if ((a > b && a>c )) {
			if(b>c) {
				System.out.println( "a is Olderthan b and C  and C is youngest");

			}else{System.out.println( "a is Olderthan b and c, b is youngest among them");}

		}else if (b > a && b>c ) {
			if(a>c)
			{	System.out.println("b is olderthan  a and c ,c is youngest among them");
			}else {
				System.out.println( "b is Olderthan a and c,a is youngest among them");
			}
		}else if (c> a && c>b) {
			if(a>b) {
				System.out.println("c is olderthan  a and b,b is youngest among them");;
			}else {
				System.out.println( "c is Olderthan a and b,a is youngest among them");
			}
		}

		}
	}


