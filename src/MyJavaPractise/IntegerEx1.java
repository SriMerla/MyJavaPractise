package MyJavaPractise;

import java.util.Scanner;

public class IntegerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		System.out.println("The result is : " + comp(num1, num2));
		

	}
	
	public static int comp(int a, int b) {
		if(a == b) {
			
			return 0;
			
		}
		
		if (a%6 == b%6) {
			
			return (a < b)? a : b;
			
		}
		
		else {
			
			return (a>b)?a:b;
		}
		
	}

}
