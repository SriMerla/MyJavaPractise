package com.session.javaclasses.collections;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	
	public static void main (String[] args){
		FileOutputStream fos =null;

		FileInputStream fis =null;
		try {
			
			File file = new File("resources/config.properties");
			System.out.println("Get absolute path - " + file.getAbsolutePath());
			
			fos = new FileOutputStream(file);
			
			Properties prop = new Properties();
			
			prop.setProperty("Url", "localhost");
			prop.setProperty("UserName", "UserA");
			prop.setProperty("Password", "pass");
			
			prop.store(fos, null);
			
			System.out.println(prop);
			
			
            fis = new FileInputStream(file);
			
			prop.load(fis);
			
			

			System.out.println(prop.getProperty("Url"));
			System.out.println(prop.getProperty("UserName"));
			System.out.println(prop.getProperty("Password"));
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			System.out.println("From Finally Block");
			
			try {
				
				if(fos !=null)
				fos.close();
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
