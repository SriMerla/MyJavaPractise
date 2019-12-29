package MyJavaPractise;

import java.util.Scanner;

public class TwoPointsDistance {

	public static void main(String[] args) {
	
        double radius = 6371.01;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter latitude of coordinate 1");
		double x1 = sc.nextInt();
		System.out.println("Enter longitude of coordinate 1");
		double x2 = sc.nextInt();
		System.out.println("Enter latitude of coordinate 2");
		double y1 = sc.nextDouble();
		System.out.println("Enter longitude of coordinate 2");
		double y2 = sc.nextDouble();
		
		
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		
		
		double distance  = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("Distance between two points:" + distance);
	}

}


