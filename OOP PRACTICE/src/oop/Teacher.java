package oop;

public class Teacher {

	String name,gender;
	int age;
	
	Teacher(){
	System.out.println("No information");
	}
	Teacher(String n, String g){
		name = n;
		gender = g;
		 
	}
	Teacher (String n, String g, int a){
		name = n;
		gender = g;
		age = a;
		
	}
	void displayInformation(){
		System.out.println("name :" +name);
		System.out.println("gender :" +gender);
		System.out.println("age :" +age);
		System.out.println("\n\n\n");
	}
}
