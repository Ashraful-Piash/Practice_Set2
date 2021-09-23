package com.hackerrank;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		int a = 50;
		double b = 3.9;
		String s = " I ";
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a integer number");
		int c = scan.nextInt();
		
		System.out.println("enter a double ");
		double d = scan.nextDouble (); scan.nextLine();
		
		System.out.println("enter string");
		String inputString = scan.nextLine();
		
	
		System.out.println("int result: " +(a+c));
		System.out.println("double result :" +(b+d));
		System.out.println("string result :" + (s+ inputString));
		
		

	}

}
