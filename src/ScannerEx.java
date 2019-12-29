import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		//Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter YOur Age");
		
		String name = scan.nextLine();
		int age = scan.nextInt();
		
		System.out.println("I am " + name +" and "+ age +" years old");


	}

}
