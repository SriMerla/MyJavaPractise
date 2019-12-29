package com.session.javaclasses.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListToSet {
	
	
	public Set setConversion(Collection collection) {
		
		// Any Collections Object must be convert to HashSet
		Set convertedSet = new HashSet();
		
		Iterator itr = collection.iterator();
		
		while(itr.hasNext()) {
			convertedSet.add(itr.next());
			
		}
		System.out.println(convertedSet);
		return convertedSet;
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new ArrayList<String>();
		
		li.add("Sri");
		li.add("Teja");
		li.add("Deepu");
		li.add("Akhi");
		
		System.out.println("Value from ArrayList : " + li);
		
		/*
		 * for(String templi : li) {
		 * 
		 * System.out.println(templi);
		 * 
		 * }
		 */
		
		Set<String> set = new HashSet<String>(li);
		
		System.out.println("Values from HashSet "+set);

	}

}
