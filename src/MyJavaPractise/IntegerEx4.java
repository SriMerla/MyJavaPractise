package MyJavaPractise;

import java.util.Scanner;

public class IntegerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer");
	    int n =sc.nextInt();
		//String n = sc.nextLine();
		//int len = n.length();
		char c = 0;
		int m =0;
		int sum =0;
		while(n>0) {
			
			m = n%10;
			sum = sum+m;
			
			n= n/10;
			
			
			
			
			
		}
		
		System.out.println("Sum of two digits : " + sum);
		

	}

}
