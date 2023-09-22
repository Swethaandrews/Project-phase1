package collectionsDemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("lado", 12345);  
		td.put("rudo", 35345);
		td.put("Judo", 5345);
		td.put("ludo", 5345);
		td.put("sudo", 34535);
		
		Set set = td.entrySet();
	
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		
		td.remove("ludo"); 
		
		
		
		

	}

}
