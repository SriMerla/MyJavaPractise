import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, Double> table = new Hashtable<String , Double>();
		
		
		table.put("Sri",5.3);
		table.put("Teja",5.4);
		table.put("Deepu",5.8);	
		
		Enumeration<String> enume = table.keys();
		
		while(enume.hasMoreElements()) {
			
			String key = enume.nextElement().toString();
			
			String value = table.get(key).toString();
			
			System.out.println(key + ":" + value);
		}

	}

}
