package math;

import java.text.NumberFormat;

public class NumberFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat currency  = NumberFormat.getCurrencyInstance();
		String result = currency.format(1234567.456); //currency format
		System.out.println(result);
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		String result1 = percent.format(0.9);
		System.out.println(result1); //percent

	}

}
