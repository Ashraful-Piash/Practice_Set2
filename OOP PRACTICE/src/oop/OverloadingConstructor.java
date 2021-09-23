package oop;

public class OverloadingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1 = new Teacher ();
		teacher1.displayInformation();
		
		Teacher teacher2 = new Teacher ("piash",  "male");
		teacher2.displayInformation();
		
		Teacher teacher3 = new Teacher ("jerin", "female",22);
		teacher3.displayInformation();
	}

}
