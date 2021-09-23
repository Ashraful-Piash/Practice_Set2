//SuppressWarning 
package basicjava;

import java.util.Scanner;

public class InputDemo {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int a= scr.nextInt();
		System.out.println("Enter another number: ");
		int b = scr.nextInt();
		int result = a+b;
		System.out.println("The result: " +result);
		
		
	}

}
