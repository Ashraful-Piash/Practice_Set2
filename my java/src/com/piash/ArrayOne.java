package com.piash;

import java.util.Arrays;

public class ArrayOne {

	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers [0] = 5;
		numbers [1] = 10;
		numbers [2] = 26;
		numbers [3] = 28;
		
		Arrays.sort(numbers); //sorting array
		System.out.println(Arrays.toString(numbers)); // string representation of array 
		System.out.println(numbers.length);
		
				
  }

}
