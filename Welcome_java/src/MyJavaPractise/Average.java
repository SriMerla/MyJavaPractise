package MyJavaPractise;

import java.util.Scanner;

public class Average {
	
	public void sumAverage() {
		System.out.println("llllllll");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		double avg = (a+b+c)/3;
		System.out.println("Average :" + avg);
	
		
	}

	public static void main(String[] args) {
		
		Average av = new Average();
		av.sumAverage();
		

	}

}
