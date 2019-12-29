package MyJavaPractise;

import java.util.Scanner;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		
		System.out.println(str.startsWith("Hello"));
		
		String subStr = str.substring(0, 4);
		System.out.println(subStr);
		
			
			System.out.println(subStr.equals("This"));
	
		
		
	}

}
