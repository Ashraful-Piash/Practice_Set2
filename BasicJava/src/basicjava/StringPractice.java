package basicjava;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "\"HelloWorld\"";
		String message1= "c:\\windows\\";
		System.out.println(message1);
		System.out.println(message);
		System.out.println(message.endsWith("d"));
		System.out.println(message.startsWith("h"));
		System.out.println(message.length());
		System.out.println (message.indexOf("e"));
		System.out.println(message.replace("world", "babe"));
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		
	}
}