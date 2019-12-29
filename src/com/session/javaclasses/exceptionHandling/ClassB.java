package com.session.javaclasses.exceptionHandling;

import java.io.FileNotFoundException;

public class ClassB {
	
	
	
	public Integer divide(int a, int b) {
		
		try{
	    
		return new ClassC().divideRes(a, b);
		
	
		
		 } catch(ArithmeticException e) {
			 e.printStackTrace();
		  }catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		
		return 0;
		
	}
	
	
	
	

}
