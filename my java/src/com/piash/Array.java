package com.piash;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers [0] = 1;
		numbers [1] = 2;
		numbers [2] = 7;
		numbers [3] = 5;
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		int x = 2;
		int y = x++;
		System.out.println(x);
		
		int z = 3;
		int q = ++z;
		System.out.println(q);
		
		double number = (double) 10/ (double) 3;
		System.out.println(number);
		
		double a = 3.8;
		int b = (int)a+8;
		System.out.println(b);
		
		String p = "23.3";
		double y1 = Double.parseDouble(p)+2;
		System.out.println(y1);
		
	}
}