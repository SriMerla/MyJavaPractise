package MyJavaPractise;

import java.util.Scanner;

public class StringEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("Using SubSting : " + str.substring(len-3, len) + str + str.substring(len-3, len));
		
		System.out.println("***************");
		
		
		String newStr = new String();
		
		for(int i=len-3; i<=len-1; i++) {
			
			newStr += str.charAt(i);
			
			
		}
		
		System.out.println("New String : "+newStr);
		
		System.out.println("Final String : " +newStr+str+newStr);

	}

}
