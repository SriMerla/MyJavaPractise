package MyJavaPractise;

import java.util.Scanner;

public class ArithematicOperations {
	
	public void operRes1(int a, int b, int c) {
		
		
		int res1 = a + b * c;
		System.out.println(res1);
		
		
		
	}
	
	public void operRes2(int a, int b, int c) {
		int res2 = (a + b)%c;
		System.out.println(res2);
	}
	
	public void operRes3(int a, int b, int c, int d) {
		int res3 = a+b*c/b;
		System.out.println(res3);
	}
    
	public void operRes4(int a, int b, int c, int d, int e, int f ) {
		
		
		int res4 = a + b/c * d - e % f;
		System.out.println(res4);
	}
	
   public void operRes5(double d, double e, double f, double g, double h, double i ) {
		
		
		double res5 = (d * e - f * g)/(h - i);
		System.out.println(res5);
	}

	/*
	 * public void operRes6(double a, double b, double c, double d, double e, double
	 * f, double g, double h, double i,double j, double k, double l ) {
	 * 
	 * 
	 * double res6 = a * (b - (c/d) + ())/(h - i); System.out.println(res5); }
	 */
		public static void main(String[] args) {
		
		ArithematicOperations oper = new ArithematicOperations();
		Scanner s = new Scanner(System.in);
		//Scanner b = new Scanner(System.in);
		System.out.println("Enter your first number");
		
		System.out.println("Enter your second number");
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = a + b;
		System.out.println(a + "+" + b +" = " + sum );
		int sub = a - b;
		System.out.println(a + "-" + b +" = " + sub);
		int mul = a * b;
		System.out.println(a + "*" + b +" = " + mul);
		int div = a/b;
		System.out.println(a + "/" + b +" = " + div);
		int mod = a%b;
		System.out.println(a + " mod " + b +" = "+ mod );
		
		oper.operRes1(-5, 8, 6);
		oper.operRes2(55, 9, 9);
		oper.operRes3(20, -3, 5, 8);
		oper.operRes4(5, 15, 3, 2, 8, 3);
		oper.operRes5(25.5, 3.5, 3.5, 3.5, 40.5, 4.5);
		
	}

}
