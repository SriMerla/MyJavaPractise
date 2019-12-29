package MyJavaPractise;

import java.util.Scanner;

public class SecondsToHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter seconds");
		int sec = sc.nextInt();
		
		int p1 = sec%60;
		int p2 = sec/60;
		int p3 = p2%60;
		
		p2 = p2/60;
		System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
		
		

	}

}
