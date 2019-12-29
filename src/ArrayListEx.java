import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListEx {

	public static void main(String[] args) {
		
		//Create an ArrayList
		
		ArrayList<String> flowers = new ArrayList<String>();
		
		//Add Elements to ArrayList flowers
		
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Lilly");
		flowers.add("Rose");
		
		// Remove Elements in Array List
		
		flowers.remove(3);
		
		//Display Elements in Array List
		
		Iterator<String> iter = flowers.iterator();
		
		while(iter.hasNext()) {
			String element = iter.next().toString();
			System.out.println(element);
		}
		
		System.out.println(flowers.get(2));
		System.out.println(flowers.indexOf("Rose"));
	}

}
