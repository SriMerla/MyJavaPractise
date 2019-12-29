package com.session.javaclasses;


class PrivateConstructorDemo{
	
	private PrivateConstructorDemo(){
		
		System.out.println("This is a private constructor of class PrivateConstructorDemo");
		
	}
	
	
}


public class PrivateConstructor{
	
	private PrivateConstructor() {
		
		System.out.println("This is a private constructor of class PrivateConstructor");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main Method");
		 PrivateConstructor pc = new PrivateConstructor();
		 System.out.println(pc);
		 
		 //PrivateConstructorDemo pcd = new PrivateConstructorDemo();
		 //System.out.println(pcd);
		

	}
	
	

}
