package MyJavaPractise;

public class AreaOfhexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Area;
		int s = 6;
		Area = (6*(s*s))/(4*Math.tan(Math.PI/6));
		
		double polygonArea;
		int n = 7;
		polygonArea = (n*s^2)/(4*Math.tan(Math.PI/n));
		System.out.println("Area of a hexagon" + Area);
		System.out.println("Area of a polygon" + polygonArea);

	}

	

	

}
