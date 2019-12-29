package MyJavaPractise;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();
		int len = str.length();
		
		int halfLen = len/2;
		System.out.println("Length of the given string : "+len);
		
		String newStr = new String();
		
		for (int i = 0; i <halfLen; i++) {
			
			newStr += str.charAt(i);
			
			
			
		}
		
		System.out.println("The new string is : " + newStr);
		
		System.out.println(newStr.length());
 
	}

}
