package MyJavaPractise;

import java.util.Scanner;

public class TableMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number :");
		int a = s.nextInt();
		for(int i = 1; i<=10; i++) {
			
		   int res = a * i;
		   System.out.println( a + "*" + i + "= " + res );
			
		}

	}

}
