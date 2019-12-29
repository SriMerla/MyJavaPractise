package com.session.javaclasses.exceptionHandling;

import java.util.Scanner;

public class ClassA {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Integer");
		int a = sc.nextInt();
		System.out.println("Enter Second Integer");
		int b = sc.nextInt();
		
		System.out.println("Result : " + new ClassB().divide(a, b));
	}
	
	

	
	

}
