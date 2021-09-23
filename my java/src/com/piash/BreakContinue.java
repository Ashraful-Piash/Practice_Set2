package com.piash;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String input = "" ;
		
		while (!input.equals("leave")){
			System.out.print("input:");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			
			if (input.equals("quit"))
			System.out.println("try again");
			
			}
		}

	}

