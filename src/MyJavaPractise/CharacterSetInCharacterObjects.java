package MyJavaPractise;

import java.nio.charset.Charset;

public class CharacterSetInCharacterObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The list of character set available in character objects :");
		for (String str : Charset.availableCharsets().keySet()) {
			
			System.out.println(str);
		}

	}

}
