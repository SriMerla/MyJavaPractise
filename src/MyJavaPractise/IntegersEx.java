package MyJavaPractise;

import java.util.Scanner;

public class IntegersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();
		
		System.out.println("The result is : " + comp(num1, num2, num3));
		

	}
	
	
	public static boolean comp(int a, int b, int c) {
		
		return (((a >= 20) || (b >= 20) ||(c >= 20)) && (((a - b) >= 20) || ((b - c) >= 20) ||((c - a) >= 20)));
		
	}

}
