package MyJavaPractise;

import java.util.Scanner;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.nextLine();
		System.out.println("Enter second string");
		String str2 = sc.nextLine();
		
		String newStr1 = new String();
		String newStr2 = new String();
		int len2 = str2.length();
		
		newStr1 += (str1.charAt(0) == ' ')? "#" : str1.charAt(0);
		
		 newStr2 += (str2.charAt(len2 - 1) == ' ')? "#" : str2.charAt(len2 - 1);
		 
		System.out.println(newStr1+newStr2);
		
		
		
		
		
		

	}

}
