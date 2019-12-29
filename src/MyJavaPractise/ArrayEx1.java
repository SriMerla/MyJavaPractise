package MyJavaPractise;

import java.util.Arrays;

public class ArrayEx1 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  
	   
	   int[] num_array = {10, -20, 0, 30, 40, 60, 60};
	 
	   System.out.println((num_array[0] == 10 || num_array[num_array.length-1] == 10));
	    
	   
	   System.out.println((num_array[0] == num_array[num_array.length-1]));
	  System.out.println("*****************");
	   
	   int[] num_array2 = {10,20,30,40,50,60};
	   
	    System.out.println((num_array[0] == num_array2[0]) && (num_array[num_array.length-1] == num_array2[num_array2.length-1]));

	    System.out.println("*****************");
	   
	   int[] num_array3 = {5,4,6};
	   
	   int len3 = num_array3.length;
	   
	   for(int i = 0; i <=len3-1; i++) {
		   
		   if((num_array3[i] == 4) || (num_array3[i] == 7)) {
			   
			   
			   System.out.println("true");
			   
		   }
		   
		   
		   
	   }
	 
	    
	    
		

	}

}
