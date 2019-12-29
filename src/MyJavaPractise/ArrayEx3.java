package MyJavaPractise;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,20,30};
		//int[] newArray= {};
		
		//int[] newArray;
		
		System.out.println("Original Array : " + Arrays.toString(array));
		
		int temp = array[0];
		for(int i =0; i<array.length-1; i++) {
			
			
			
			array[i] =  array[i+1];
			
			
			}
		
		array[array.length-1] =temp;
		
		System.out.println("Rotated Array : " + Arrays.toString(array));
		

	}

}
