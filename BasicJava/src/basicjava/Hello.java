package basicjava;

import java.awt.Point;
import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World \nI am coming");
		Date today = new Date();
		System.out.println("Today is: " +today);
		byte x= 5;
		byte y = x;
		x = 10;
		System.out.println(y);
		Point point1 = new Point (1,1);
		Point point2 = point1;
		point1.y= 2;
		System.out.println(point2);
		String message = new String ("Hello Love" + " Love you");
		
		System.out.println(message.startsWith("He"));
		System.out.println(message.length());
		System.out.println(message.indexOf("l"));
	}

}
