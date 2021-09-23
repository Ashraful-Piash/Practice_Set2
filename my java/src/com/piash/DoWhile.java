package com.piash;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		
		String input = "";
		do {
			System.out.println("Input: ");
			input  = scanner.next().toLowerCase();
			System.out.println(input);
			
		}while (!input.equals("leave"));

	}

}
