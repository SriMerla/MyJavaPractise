package MyJavaPractise;

import java.util.Scanner;

public class IntegerRange {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
	    int a = sc.nextInt();
	    System.out.println("Enter second number");
	    int b = sc.nextInt();
	    int c = 5;
	    System.out.println("\n Integer Range between "+ a +"and " + b + "and divisible by 5");
	    
	    for(int i=0; i<b; i++) {
	    	
	    	if((i>a) && (i % 5 == 0)) {
	    		
	    		System.out.print("\t" + i);
	    		
	    	}
	    	
	    	
	    	
	    }
	     
		
	    }
		
	}


