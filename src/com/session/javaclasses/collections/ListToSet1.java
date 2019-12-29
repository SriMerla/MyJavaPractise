package com.session.javaclasses.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListToSet1 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new ArrayList<String>();
		
		li.add("Sri");
		li.add("TTeja");
		li.add("Deepu");
		li.add("Akhi");
		
		
		
		ListToSet ls = new ListToSet();
		ls.setConversion(li);

	}

}
