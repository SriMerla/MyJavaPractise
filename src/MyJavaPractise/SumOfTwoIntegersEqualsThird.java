package MyJavaPractise;

import java.util.Scanner;

public class SumOfTwoIntegersEqualsThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		System.out.println("Sum of two numbers equals to third number : " + sum(a, b, c));
		System.out.println("The result of compare method: " + compare(a, b, c));
		System.out.println("First digits of any two numbers : " + rightmost(a, b, c));
		
		
	}
	
	public static boolean sum(int x, int y, int z) {
		return ((x+y) == z || (y+z) == x || (x+z) == y);
		
	}
	public static boolean compare(int x, int y, int z) {
		return ((x < y) && (y < z));
		
	}
	
	public static boolean rightmost(int x, int y, int z) {
		return ((x%10 == y%10) || (y%10 == z%10) || (x%10 == z%10));
		
	}

}
