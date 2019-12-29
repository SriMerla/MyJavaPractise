package com.session.javaclasses;

public class Factorial {
	
	
	public int fac(int input) {
		
		int factorial =1;
		
		for(int i=1; i<=input; i++) {
			
			factorial = factorial*i;
			System.out.println(factorial);
			
		}
		return factorial;
		
	}
	
	public int fact1(int input) {
		int factorial = 1;
		if(input == 1) {
			return factorial;
		}
		
		factorial = fact1(input - 1)*input;
		System.out.println("Response of the method fact1 : " + factorial);
		return factorial;
		
	}

	public static void main(String[] args) {
		
      Factorial f = new Factorial();
      f.fac(5);
      System.out.println("#####################");
      f.fact1(5);
		

	}

}
