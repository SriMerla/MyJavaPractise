package com.session.javaclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDeserializationDemo {
	
	
	public static Object DoSerialization(final Object object) {
		
		System.out.println("From DoSerialization Method");
		if(object instanceof CustomerVO) {
			
			CustomerVO customerVO = (CustomerVO) object;
			
			try (FileOutputStream fos = new FileOutputStream("serializeDate.txt");ObjectOutputStream oos = new ObjectOutputStream(fos)){
				
				oos.writeObject(customerVO);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		return object;
		
	}
	
	public static void DoDeSerialization(final Object object) throws ClassNotFoundException {
		
		System.out.println("From DeSerialization Method");
		if(object instanceof CustomerVO) {
			
			CustomerVO newCustomerVO = (CustomerVO) object;
			
			
			
			 try(FileInputStream fis = new FileInputStream("serializeData.txt"); ObjectInputStream ois = new ObjectInputStream(fis)) {
				 
				Object deSerialization = ois.readObject();
				System.out.println(deSerialization);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main Method");
		System.out.println("****************************");
		System.out.println("Serialization) Do Serialization");
		System.out.println("DeSerialization) Do DeSerialization");
		System.out.println("****************************");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		String choice = sc.next();
		
		switch(choice) {
		
		case "Serialization" :
			
			CustomerVO  customerVO = new CustomerVO(101, "Sri", "Columbus", "Merla", "Sri@123");
			DoSerialization(customerVO);
			System.out.println("SERIALIZATION IS SUCCESSFULL");
				
			
			break;
		
		case "DeSerialization" :
			CustomerVO  newCustomerVO = new CustomerVO(101, "Sri", "Columbus", "Merla", "Sri@123");
			//CustomerVO  customerVO1 = new CustomerVO(102, "Satish", "Columbus", "Kakara", "Satish@123");
			//DoSerialization(customerVO1);
			Object doSerializationInstance = DoSerialization(newCustomerVO);
			System.out.println(doSerializationInstance);
			
			System.out.println("DE-SERIALIZATION IS SUCCESSFULL");
			
			break;
		}
	}

}
