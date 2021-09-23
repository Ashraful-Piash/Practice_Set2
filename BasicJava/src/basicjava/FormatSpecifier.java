package basicjava;

public class FormatSpecifier {

	public static void main(String[] args) {
		boolean b  = true;
		char c = 'a';
		int i = 100;
		float f= 4.95f;
		short s= 7777;
		double d= 555.888;
		
		
		System.out.printf("boolean b=%b\n" ,b);
		System.out.printf("character c=%c\n",c);
		System.out.printf("integer i=%d\n",i);
		System.out.printf("floating f=%.2f\n",f);
		System.out.printf("short s=%d\n",s);
		System.out.printf("double d=%.3f\n",d);
		

	}

}
