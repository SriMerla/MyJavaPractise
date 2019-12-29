package com.session.javaclasses;

import java.util.Date;

public class ObjectCassMethodDemoo {
	
	
public static void main(String[] args) {
		
		System.out.println("Form Main Method");
		//Product product =new Product(01, Cream, 20, 2019, 2022);
		Product product = new Product(101, "ButterMilk", 7, new Date(), "48hours");
		Product product1 = new Product(101, "ButterMilk", 7, new Date(), "48hours");
		
		Class classInstance = product.getClass();
		System.out.println("Class Name : " + classInstance); // This is the instance of the class
		System.out.println("Class Name : " + classInstance.getName()); //This is a String
		
		// hashcode is an identification number which is assigned by jvm for internal processing for each and every objet
		
		int hashcode = product.hashCode();
		System.out.println("HashCode : " + hashcode);
		
		System.out.println("State of an object : " + product.toString());
		
		boolean result = product.equals(product1);
		System.out.println(result);
		
		Product product2 = product;
		result = product.equals(product2);
		System.out.println(result);
		
		System.out.println("End of Main Method");
		
	    
	    try {
	    	System.out.println("***********************");
			Product product3 = (Product) product1.clone();
			System.out.println("Original Object");
			System.out.println(product1);
			System.out.println("Cloned Object");
			System.out.println(product3);
			boolean result1 = product1.equals(product3);
			System.out.println(result1);
			if(product1 == product3) {
				System.out.println("Same Memoory Location");
				
			}
			else {
				
				System.out.println("Different Memory Locations");
			}
			
			product3.setProductId(201);
			System.out.println("Updated Cloned Object :" +product3);
			
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}

}
