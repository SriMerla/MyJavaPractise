import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your Name and Age Seperated with a Comma");
		
		String input = bf.readLine();
	    
		StringTokenizer st = new StringTokenizer(input, ", ");
		
		String name = st.nextToken();
		int age = Integer.parseInt(st.nextToken());
		
		System.out.println("I am " + name +" and "+ age +" years old");

	}

}
