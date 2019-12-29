package MyJavaPractise;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		
		int len = str.length();
		System.out.println("Length of the string : " + len);
		
		for (int i=len-1; i >= 0; i--) {
			
			System.out.println(str.charAt(i));
			
		}

	}

}
