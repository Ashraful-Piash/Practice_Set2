package com.hackerrank;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter a number");
		int N = scanner.nextInt();
		if (N%2 !=0){
	        System.out.println("Weird");
	    }
	     else if(N>=2 && N<=5){
	         System.out.println("Not Weird");
	     }
	     else if (N>=6 && N<=20){
	         System.out.println("Weird");
	     }
	     else if (N>20){
	         System.out.print("Not Weird");
	     }
	       scanner.close();
	    }
	


	}


