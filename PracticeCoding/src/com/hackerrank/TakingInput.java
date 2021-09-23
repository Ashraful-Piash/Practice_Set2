package com.hackerrank;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter number");
		//System.out.println("Enter number 1 :");
		//int number1 = scanner.nextInt();
		//System.out.println("Enter number 2 :");
		//int number2 = scanner.nextInt();
		//int sum = number1+number2;
		//System.out.println("sum of the numbers : " +sum);
		boolean b1 = scanner.hasNextInt();
		System.out.println(b1);
		
	}

}
