package MyJavaPractise;

import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,20,30,40,50,60};
		
		System.out.println("Original Array : " + Arrays.toString(array));
		
		int temp = array[0];
		array[0] = array[array.length-1];
		array[array.length-1] = temp;
		
		System.out.println("Swapped Array : " + Arrays.toString(array));
		
		

	}

}
