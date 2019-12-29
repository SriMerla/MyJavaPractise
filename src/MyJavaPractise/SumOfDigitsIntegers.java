package MyJavaPractise;

import java.util.Scanner;

public class SumOfDigitsIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an two digit integer number");
		int m = sc.nextInt();
		while (m > 0) {
			
			n = m %10;
			sum = sum + n;
			m = m/10;
		}
		
		System.out.println("Sum of digits in a number :" + sum);
		
		
		

	}

}
