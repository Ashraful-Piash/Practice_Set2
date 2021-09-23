package com.piash;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Print my Age:");
		
		byte age = scanner.nextByte();
		System.out.println("I am " +age);
		
		Scanner scanner1 = new Scanner (System.in);
		System.out.print("Name:");
		String name = scanner1.nextLine().trim();
		System.out.println("I am "+ name);
		

	}

}
