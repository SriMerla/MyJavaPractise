package com.session.javaclasses.stringbufferandstringbuilder;

public class StringBufferAndBuilder {
	
	public String concat1(String S1) {
		
		 S1 = S1+"Satish"; // new value in S1 store in new object
		 
		 return S1;
	
		
	}
	
	public void concat2(StringBuffer S2) {
		
		S2.append("Satish");
		
		
	}
	
	public void concat3(StringBuilder S3) {
		 
		S3.append("Satish");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBufferAndBuilder sb= new StringBufferAndBuilder();
		String S1 = "Sri";
		S1=sb.concat1(S1);
		
		System.out.println("String : " + S1);
		
		StringBuffer S2 = new StringBuffer("Sri");
		sb.concat2(S2);
		
		System.out.println("String Buffer : " + S2);
		
		StringBuilder S3 = new StringBuilder("Sri");
		sb.concat3(S3);
		
		System.out.println("String Builder : " + S3);
		
		//String strBuffertoBuilder = S2.toString();
		
		

	}

}
