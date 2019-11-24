
public class EnumExample {
	
	public enum colors{
		Red, Yellow, Green
	}

	public static void main(String[] args) {
		
		colors ob[] = colors.values();
		
		for (colors c: ob) {
			
			System.out.println(c);
		}
	

	}

}
