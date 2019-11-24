package MyJavaPractise;

import java.util.Scanner;

public class Swap {
	
	public void twoNumSwap() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before Swap : " + a +" "+ b);
		
		int temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("After Swap : " + a +" "+ b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s = new Swap();
		s.twoNumSwap();

	}

}
