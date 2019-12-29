package MyJavaPractise;

public class Calculate {
    
	public int sum(int a, int b) {
		
		int sum = a + b;
		
		System.out.println("Sum of two numbers : " + sum);
		
		return sum;
		
		
	}
	
	public void divide(int a, int b) {
		
		int div = a/b;
		System.out.println("Division of two numbers :" + div);
		
	}
	
	public void multiply(int a, int b) {
		
		int mul = a *  b;
		System.out.println(a + " * " + b +" = "+ mul);
	}
	public static void main(String[] args) {
		
		Calculate obj = new Calculate();
		obj.sum(74, 36);
		obj.divide(50, 3);
		obj.multiply(25, 5);

	}

}
