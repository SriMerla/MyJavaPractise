package MyJavaPractise;

import java.util.Scanner;

public class CompareTwoNumbers {
	
	public void compare() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		
		if(n1 != n2 && n1 < n2 && n1 <= n2) {
			
			System.out.println(n1 + "!=" + n2);
			System.out.println(n1 + "<" + n2);
			System.out.println(n1 + "<=" + n2);
		}
		
		else {
			
			System.out.println(n1 + ">" + n2);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareTwoNumbers c = new CompareTwoNumbers();
		c.compare();

	}

}
