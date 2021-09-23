package com.piash;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short x = 1;
		int y = x+2;
		System.out.println(y); //implicit casting
		
		double x1 = 1.1;
		int y1 = (int) x +2; //ekhane 3.1 howar kotha chilo
		System.out.println(y1);// but eikhane explicit casting kora hoise
		                         //er jonno double theke int value hoye gese
		
		
		String x2 = "2";
		int y2 = Integer.parseInt(x2)+2;
		System.out.println(y2);  //string theke integer
		
		String x3 = "4.4";
		double  y3 = Double.parseDouble(x3)+1;
		System.out.println(y3);
		
		String x4 = "5.5";
		float y4 = Float.parseFloat(x4)+1;
		System.out.println(y4);

	}

}
