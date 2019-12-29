package MyJavaPractise;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10,20,30};
		int[] array2 = {40,50,60};
		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " + Arrays.toString(array2));
	    
		int[] newArray = {array1[0], array2[array2.length-1]};
		
		System.out.println("New Array : " + Arrays.toString(newArray));
		
		

	}

}
