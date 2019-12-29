package MyJavaPractise;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter String");
		 * String str = sc.nextLine();
		 */
		String str = "SriSatish";
		int len = str.length();
		int index = 6;
		
		String newStr = new String();
		String finalStr =new String();
		
		for(int i= 6; i<=len-1; i++) {
			
			
			newStr += str.charAt(i);	
			
			}
		
		for(int j = 0; j<=2; j++) {
			finalStr = finalStr + newStr;
			
		}
			
		System.out.print(finalStr);	
			
		}

	}


