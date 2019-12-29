package MyJavaPractise;

import java.util.Scanner;

public class IntegerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number between ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("The result is : " + common(num1, num2));

	}
	
	public static boolean common(int a, int b) {
		
		if ((a<25) || (a>75) || (b<25) || (b>75) ) {
			
			return false;
		}
		
		else {
			
			int x = a%10;
			int y = b%10;
			int p = a/10;
			int q = b/10;
			
			return ((x==y)|| (p==q));
		}
	}

}
