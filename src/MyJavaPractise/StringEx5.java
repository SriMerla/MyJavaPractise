package MyJavaPractise;

import java.util.Scanner;

public class StringEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in); System.out.println("Enter any String");
		 String str = sc.nextLine();
		
		
		//String str = "   Sri";
		int len = str.length();
		
		
		
		char newStr;
		
		
		for(int i=0; i<3; i++) {
			
		 newStr = str.charAt(i);
		 
		 if(newStr == ' ') {
			 
			// newStr += str.charAt(i);
			 
			 System.out.print("#");
			 
		 }
		 
		 else {
			 
			 System.out.print(str.charAt(i));
			 
		 }
			
			
		}
		// System.out.println(str.substring(0, 3));
  // System.out.println(newStr);
	}

}
