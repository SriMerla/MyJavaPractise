package MyJavaPractise;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		System.out.println("Enter Seconod String");
		String str2 = sc.nextLine();
		
		System.out.println("Using SubString : "+str1.substring(1)+str2.substring(1));
		
		String newStr1 = new String();
		String newStr2 = new String();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		for(int i=1; i<len1; i++) {
			
			newStr1 += str1.charAt(i);
			
		}
		
		for(int j=1; j<len2; j++) {
			
			newStr2 += str2.charAt(j);
		}
		
		System.out.println(newStr1+newStr2);
	}
	


}
