
public class ExampleProgram {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		if(a < b){
		    
			System.out.println("a is less than b");

		}
		else if(a == b) {

		     System.out.println("a and b are equal");
			 
		}
		else{

		     System.out.println("b is less than a");
			 
		}
		
        int count = 1;
		
		switch(count)
		{
		case 1: 
			    System.out.println(" Statement 1 ");
		        break;
		case 2: 
			    System.out.println("Statement 2");
		        break;
		case 3: 
			    System.out.println(" Statement 3");
		        break;
		default: System.out.println("Default Statement");      				
				
		}
		
       for(int i=1; i<=5; i++) {
			
			System.out.println("i value : " + i);
			
		}
		
		
		String fruits[] = {"Apple","Orange","Grapes"};
		
		for (String n : fruits ) {
			
			System.out.println(n);
		}
		
		int i = 0;
		while (i<=5) {
			
			System.out.println(i);
			i++;
		}
		
      int j =10;
		
		do {
			
			System.out.println(j);
			j++;
		
		}while(i<5);
		

	}

}
