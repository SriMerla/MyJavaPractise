package MyJavaPractise;

import java.util.Scanner;

public class CountSpacesNumbersEtcInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();  //input str = Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
		
		int len = str.length();
		System.out.println("Length of the string : " + len);
		
		int alphaCount=0;
		int numCount=0;
		int spaceCount=0;
		int OtherCount=0;
		
		for (int i =0; i <= len-1; i++) {
			
			char c = str.charAt(i);
			
			System.out.println((int)c);
			
			if((int)c >65 && (int)c < 90 && (int)c >97 && (int)c <122 ) {
				
				alphaCount++;
			}
			
			else if(c == ' ') {
				
				spaceCount++;
				
			}
			
			else {
				
				numCount++;
				
			}
			
			/*
			 * if(Character.isAlphabetic(c)) {
			 * 
			 * alphaCount++;
			 * 
			 * 
			 * }
			 * 
			 * else if (Character.isDigit(c)) {
			 * 
			 * numCount++;
			 * 
			 * }
			 * 
			 * else if(Character.isSpaceChar(c)) {
			 * 
			 * spaceCount++; } else {
			 * 
			 * OtherCount++;
			 * 
			 * }
			 */
		}
		
		System.out.println("Alphabet Count : " + alphaCount);
		System.out.println("Number Count : " + numCount);
		System.out.println("Space Count : " + spaceCount);
		System.out.println("Othes Count : " + OtherCount);

	}

}
