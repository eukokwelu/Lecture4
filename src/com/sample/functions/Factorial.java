package com.sample.functions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Interger :");
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	public static int factorial(int n) {
		if(n == 1) {
			System.out.println("factorial(" + n + ") = 1");
			return 1;
			
		}else {
			System.out.println("factorial(" + n + ") = " + n + " *factorial(" + (n-1) +")");
		
			return n* factorial(n-1);
		}
	}
}


