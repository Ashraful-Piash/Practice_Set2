package teacher;

public class Teacher {
	String name,gender;
	int phone,age;
	
	Teacher (String n, String g,int a,int ph){
		name = n;
		gender = g;
		age = a;
		phone = ph;
		
	}
	
	void displayInformation () {
		System.out.println("name :"+name);
		System.out.println("gender:"+gender);
		System.out.println ("age:"+age);
		System.out.println ("phone :"+phone);
		System.out.println ("\n\n");
	}
	
}
