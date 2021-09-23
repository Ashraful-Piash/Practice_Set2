package teacher;

public class Test {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher ("anisul islam","male",26,987);
		 
		
		//teacher1.setInformation("anisul", "male",25, 23456); //parametirized method
		
		teacher1.displayInformation();
		
		Teacher teacher2 = new Teacher ("piash","male",26,999);
		
		//teacher2.setInformation("piash","male",26,2345);
		
		teacher2.displayInformation();
		
	}

}
