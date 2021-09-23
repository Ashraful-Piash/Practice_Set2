package com.piash;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hasHighIncome = false;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		
		System.out.println(isEligible);
		
		int temperature = 22;
		boolean isWarm = temperature > 20 && temperature < 25;
		System.out.println (isWarm);

	}

}
