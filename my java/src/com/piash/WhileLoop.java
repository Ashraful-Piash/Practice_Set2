package com.piash;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		String input = "" ;
		
		while (!input.equals("leave")) {
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}

	}

}
