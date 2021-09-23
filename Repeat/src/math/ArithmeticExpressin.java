package math;

public class ArithmeticExpressin {

	public static void main(String[] args) {
		int result = 10+3;
		System.out.println(result);
		double result1 = (double)10 / (double)3;
		System.out.println(result1);
		
		int x = 3;
		x++;
		System.out.println(x);
		
		int x1 = 3;
		int y = x1++;
		System.out.println("value of x1: " +x1); // postfix increment operator
		System.out.println("value of y :" +y);
		
		int x2 = 4;
		int y1 = ++x2;
		System.out.println(x2);
		System.out.println(y1); //prefix  increment operator
		

	}

}
