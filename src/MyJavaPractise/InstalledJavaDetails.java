package MyJavaPractise;

public class InstalledJavaDetails {

	public static void main(String[] args) {
	
		System.out.println("Java Version :" + System.getProperty("java.version"));
		System.out.println("Java Runtime Version :" + System.getProperty("java.runtime.version"));
		System.out.println("java Home :" + System.getProperty("java.home"));
		System.out.println("java Vedor :" + System.getProperty("java.vendor"));
		System.out.println("java Vendor Url :" + System.getProperty("java.vendor.url"));
		System.out.println("java Class Path : " + System.getProperty("java.class.path"));
		

	}

}
