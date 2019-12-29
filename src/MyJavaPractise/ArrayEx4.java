package MyJavaPractise;

import java.util.Arrays;

public class ArrayEx4 {
	
	
	public void largest(int[] array) {
		
		System.out.println("Enter elements in array");
		System.out.println("Original Array : " + Arrays.toString(array));
		
		if(array[0] > array[array.length-1]) {
			
			System.out.println(array[0]);
			
		}
		
		else if(array[0] < array[array.length-1]){
			
			System.out.println(array[array.length-1]);
		}
		
		else {
			
			System.out.println("Both elements are same  ");
		}
		
		
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		ArrayEx4 arrayEx4 =new ArrayEx4();
		arrayEx4.largest(new int[]{40,20,30,20});
		

	}

}
