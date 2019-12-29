package MyJavaPractise;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String");
		String str2 = sc.nextLine();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if (len1 < len2) {
			
			System.out.println(str1 + str2 + str1 );
			
			
		}
		
		else {
			
			System.out.println(str2 + str1 + str2 );
			
		}
		

	}

}
