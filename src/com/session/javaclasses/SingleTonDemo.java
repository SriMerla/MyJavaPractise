package com.session.javaclasses;

import java.util.HashMap;
import java.util.Map;

class MySingleTonEx{
	
	private static MySingleTonEx instance;
	static Map<Integer, String> hashMap = new HashMap<Integer, String>();
	
	public static MySingleTonEx getInstance() {
		
		if(instance == null) {
			instance = new MySingleTonEx();
			instance.loadLoginDetails();
		}
		
		System.out.println("Response of the method getInstance is : " + instance);
		return instance;
		
	}
	
	public void loadLoginDetails() {
		
		hashMap.put(1111, "Guest@123");
		hashMap.put(1122, "Test@123");
		hashMap.put(1133, "Trail@123");
		hashMap.put(1144, "Admin@123");
		hashMap.put(1155, "User@123");
		hashMap.put(1166, "Customer@123");
		
		
	}
}

public class SingleTonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("From Main Method");
		
		MySingleTonEx inEx = MySingleTonEx.getInstance();
		System.out.println(inEx);
		System.out.println("End of Main Method");

	}

}
