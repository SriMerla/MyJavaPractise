import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Text 1");
		list.add("Text 2");
		list.add("Text 3");
		
		System.out.println("#1 Normal For Loop");
		
		for (int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("#2 For Each Loop");
		
		for (String value : list) {
			
			System.out.println(value);
		}
		
		System.out.println("#3 while Loop");
		
		int j= 0;
		while(list.size()>j) {
			System.out.println(list.get(j));
			j++;
			
		}
		
		System.out.println("#4 Iterator");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
		
	}

}
