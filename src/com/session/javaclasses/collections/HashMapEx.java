package com.session.javaclasses.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;


public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************  HASH MAP ****************");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println(map);
		map.put("Sri", 1991);
		map.put("Teja", 1993);
		//map.put("Blank", null);
		map.put("Deepu", 1994);
		//map.put(null, 000);
		map.put("Deepu", 1994);
		map.put("Abi", 1994);
		
		
		System.out.println(map);
		
		TreeMap<String, Integer> tsmap = new TreeMap<String, Integer>(map);
		//tsmap.
		
		System.out.println(tsmap);
	    int value  = map.get(null);
	    System.out.println("NUll key and  value is : " +  value);
		//int val2 = map.get("Blank");
		//System.out.println("Null Value and value is : " + val2);   //Null value can't be printed
		
		System.out.println(map.keySet());	
		
		System.out.println("*************** HASH SET ****************");
		
		HashSet<String> set = new HashSet<String>();
		
		HashSet<Integer> intSet = new HashSet<Integer>();
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(13);
		intSet.add(23);
		intSet.add(5);
		intSet.add(43);
		intSet.add(456);
		System.out.println(intSet);
		TreeSet<Integer> Ts1 = new TreeSet<Integer>(intSet);
		System.out.println("Sorted elements in HashSet using TreeSet : "+Ts1);
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		//set.add(null);
		set.add("Green");
		System.out.println(set);
		
		TreeSet<String> Ts = new TreeSet<String>(set);
		
		System.out.println("Sorted elements in HashSet using TreeSet : "+Ts);

		
		Iterator<String> it = set.iterator();
		
		
		while(it.hasNext()) {
			
			
			System.out.println("Iterator is used to iterate the values : " + it.next());
			
		}
		
		set.remove("Red");
		
		System.out.println(set.contains("Red"));
		
		set.clear();
		System.out.println(set);
	
		
		System.out.println("*************** ARRAY LIST ****************");
		
		
		List<String> arr = new ArrayList<String>();
		
		arr.add("Hello");
		arr.add("World");
		
		System.out.println(arr);
		arr.add(0, "Hi");
		System.out.println(arr);
		
		//arr.add(1, null);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
		ArrayList<Integer>  arrli = new ArrayList<Integer>();
		int n = 5;
		for(int i = 1; i<=5; i++) {
			
			arrli.add(i);
			
			
		}
	    
		
		System.out.println(arrli);
		arrli.remove(4);
		System.out.println(arrli);
		
		
		

	}
	

	

}
