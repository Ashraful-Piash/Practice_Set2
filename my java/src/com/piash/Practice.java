package com.piash;

public class Practice {

	public static void main(String[] args) {
		// Methods of String Class
		String message = new String ("  Hello World" + "! !");
		System.out.println(message.length());
		System.out.println(message.indexOf("o"));
		System.out.println(message.startsWith("  "));
		System.out.println(message.endsWith("! !"));
		System.out.println(message.indexOf("W"));
		System.out.println(message.replace("H","M"));
		System.out.println(message);
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		
		
	}

}
