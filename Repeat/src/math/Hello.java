package math;

import java.awt.Point;
import java.util.Date;
import java.util.Scanner;

public class Hello {

	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter number");
		int a = scanner.nextInt();
		System.out.println("enter another number");
		int b = scanner.nextInt();
		
		int result = a+b;
		System.out.println("the result :"+result);
		Date today = new Date();
		System.out.println("Today is:"+today);
		
		Point point1= new Point(1,2);
		Point point2=point1;
		point1.y=5;
		System.out.println(point2);
		
	}

}
