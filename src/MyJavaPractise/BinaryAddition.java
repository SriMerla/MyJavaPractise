package MyJavaPractise;

import java.util.Scanner;

public class BinaryAddition {
	
	public void add() {
		
		Scanner scan = new Scanner(System.in);
		long b1,b2;
		int i=0, remainder = 0;
		int sum[] = new int[25];
		
		System.out.println("Enter First Binary Number");
		b1 = scan.nextLong();
		System.out.println("Enter Second Binary Number");
		b2 = scan.nextLong();
		
		
		
		while(b1 != 0 || b2!=0) {
			
			sum[i++] = (int)((b1 % 10 + b2 % 10 + remainder) % 2);
			remainder = (int)((b1 % 10 + b2 % 10 + remainder) / 2);
			b1 =b1/10;
			b2 =b2/10;
			
		}
		
		if(remainder != 0 ) {
			
			sum[i++] = remainder;
			
		}
		
		--i;
		System.out.print("Sum of Binary is :");
		  while(i >= 0)
		  {
		   System.out.print(sum[i--]);
		  }
		  System.out.println("\n---------------------------------");
		 }
	   
	 
	  
	

	public static void main(String[] args) {
		BinaryAddition add = new BinaryAddition();
		add.add();
		
	}

}
