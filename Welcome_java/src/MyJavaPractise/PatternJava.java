package MyJavaPractise;

public class PatternJava {
	
	public void pattern(int n) {
		
		
		for(int i=0;i<=n; i++) {
			
			for(int j=0; j<=i ; j++) {
				
				System.out.println(i + ":" + j);
			}
		}
	}

	public static void main(String[] args) {
		 PatternJava pj = new PatternJava();
		 pj.pattern(5);
		
	}

}
