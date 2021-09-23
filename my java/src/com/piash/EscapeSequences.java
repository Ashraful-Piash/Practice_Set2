package com.piash;

public class EscapeSequences {

	public static void main(String[] args) {
		String message = new String ("I Love You \"Jerin\"");
		System.out.println(message);
		
		String message1 = new String ("c:\\windows\\...");
		System.out.println(message1);
		
		String message2= new String (" I love Allah\nI love Hajrat Muhammad ");
		System.out.println(message2.trim());
		
		String message3 = "I need a\n\ttab";
		System.out.println(message3);
		
		/* 
		 * four escape sequences
		 * 1.double quote
		 * 2.new line
		 * 3.tab
		 * 4.backslash
		 */
	}

}
