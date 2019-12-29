import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your Name");
		String name = bf.readLine();
		
		System.out.println("Enter Your Age");
		int age = Integer.parseInt(bf.readLine());
		
		// int age = bf.read();
		
		System.out.println("I am " + name +" and "+ age +" years old");
		
		

	}

}
