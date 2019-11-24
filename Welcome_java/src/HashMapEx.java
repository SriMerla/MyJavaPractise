import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Double> names = new HashMap<String, Double>();
		
		names.put("Sri",5.3);
		names.put("Teja",5.4);
		names.put("Deepu",5.8);	
		
		Iterator<Entry<String, Double>> it = names.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<String, Double> entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
