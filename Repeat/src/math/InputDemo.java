package math;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("enter your age");
		
		float age = scanner.nextFloat();
		System.out.println("age is:"+age);
		
		System.out.print("enter name");
		String name = scanner.next();
		
		
		
		System.out.println("name is:"+name);

	}

}
