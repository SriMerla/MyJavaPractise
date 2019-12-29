package MyJavaPractise;

import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {80,30,90,40,50};
		
		System.out.println("Original String :" +   Arrays.toString(array));
		
		int halflen = array.length/2;
		
		if(array[0] >= array[array.length - halflen -1] && array[0] >= array[array.length - 1]) {
			
		
		    System.out.println("max value first element : "+ array[0]);
		
		}
		
		else if(array[array.length-1] >= array[array.length - halflen -1]) {
			
			
			System.out.println("max value last element : "+ array[array.length-1]);
			
			
		}
		
		else {
			
			System.out.println("max value middle element : "+ array[array.length-halflen-1]);
			
		}

	}

}
