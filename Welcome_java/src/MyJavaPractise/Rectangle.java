package MyJavaPractise;

public class Rectangle {
	
	public void calRec(int l, int b) {
		
		double area = l*b;
		double perimeter = 2*(l+b);
		System.out.println("Area is " + l + "*" + b + "=" + area);
		
		System.out.println("Perimeter is 2 * " +"("+ l + "+" + b + ")"+ "=" + area);
		
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		rec.calRec(23,45);

	}

}
