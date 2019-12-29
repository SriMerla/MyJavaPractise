package MyJavaPractise;

public class DivideByThreeAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Divisible by 3");
		
		for(int i=0; i<=100; i++) {
			if(i%3 == 0) {
				
				
				System.out.print(i + ", ");
			}		
				
		}
		System.out.println("\n\nDivisible by 5");
		for(int i=0; i<=100; i++) {
			if(i%5 == 0) {
				
				
				System.out.print(i + ", ");
			}		
				
		}
		
		System.out.println("\n\nDivisible by 3 and 5");
		for(int i=0; i<=100; i++) {
			if(i%5 == 0 && i%3 == 0) {
				
				
				System.out.print(i + ", ");
			}		
				
		}

	}

}
