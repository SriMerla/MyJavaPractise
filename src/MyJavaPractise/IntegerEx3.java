package MyJavaPractise;

import java.util.Scanner;

public class IntegerEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = sc.nextInt();
		int count = 0;
		while(n != 1) {
			
			if(n%2 == 0) {
				
				n = n/2;
				
				count++;
				System.out.println("The result is : " + n + " " +count);
				
			}
			
			else {
				
				n = (n*3)+1;
				count++;
				
				System.out.println("The result is : " + n+ " " + count);
				
			}
			
		}
	//	System.out.println("The result is : " + n+ " " + count);
		sc.close();
		
		
		

	}

}
