package MyJavaPractise;

public class InsertWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "This is awesome!";
		String word = "not  ";
		
		int index = 7;
		
	    int len = str.length();
	    System.out.println(len);
	    
	    String newStr = new String();
	    
	    for (int i=0; i<=len-1; i++) {
	    	
	    	newStr += str.charAt(i);
	    	
	    	if (i == index) {
	    		
	    		newStr += word;
	    		
	    		
	    	}
	    	
	    }
	    
	    System.out.println("Original String : "+ str + "Modified String : " + newStr);

	}

}
