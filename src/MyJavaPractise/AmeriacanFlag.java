package MyJavaPractise;

public class AmeriacanFlag {
	
	public void drawFlag() {
		
		String f1 = "* * * * * ================================= " ;
		String f2= "* * * * * * =================================";
		String f3 = "==========================================================";
		
		for (int i = 0; i<=4; i++) {
			System.out.println(f1);
			System.out.println(f2);
		}
		for (int j =0; j<=8; j++) {
			System.out.println(f3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmeriacanFlag flag  = new AmeriacanFlag();
		flag.drawFlag();

	}

}
