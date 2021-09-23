package math;

public class StaticVariableCount {
	static int count = 0;
	
	StaticVariableCount(){
		count ++;
	}
	
	void totalStaticVariableCount () {
		System.out.println("Student:" +count);
	}

}
