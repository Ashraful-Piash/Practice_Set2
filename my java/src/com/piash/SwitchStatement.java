package com.piash;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		String role = scanner.nextLine();
		switch (role) {
		case "admin":
			System.out.println("You are an admin");
			break;
		
		case "moderator":
			System.out.println("You are a moderator");
			break;
			
			default :
				System.out.println("you are a guest");
		}

	}

}
