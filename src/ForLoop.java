
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("i value : " + i);
			
		}
		
		String[] names = new String[3];
		
		
		//names[0] = "John";
		//names[1] = "Mark";
		//names[2] = "Leo";
		
		//names[3] = {John,Mark,Leo};
		String fruits[] = {"Apple","Orange","Grapes"};
		for (String n : fruits ) {
			
			System.out.println(n);
		}

	}

}
