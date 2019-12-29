package MyJavaPractise;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 3, -5, 4};
		
		int[] array2 = {1, 4, -5, -2};
		
		//int[] newArray;
		String str = new String();
		
		for(int i = 0; i<array1.length; i++) {
						
				 str += Integer.toString(array1[i] * array2[i])+ " "; 
				
				
			}
		
		
		System.out.println(str);


		
	}
	

}
