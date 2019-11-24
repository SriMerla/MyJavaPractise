package MyJavaPractise;

public class Circle {
	
	public void radius(double r){
		
		double area = 3.14*r*r;
		
		double perimeter = 2*3.14*r;
		
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		c.radius(7.5);

	}

}
