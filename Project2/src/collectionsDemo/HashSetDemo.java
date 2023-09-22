package collectionsDemo;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> cities = new HashSet<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Mumbai");
		
		// print the items in the list
		for (String t: cities)
		{
			System.out.println(t);
		}

		// print all the items in the Array list
		
		System.out.println(cities.size());
		
		// Check if an item is in list or not
		
		System.out.println(cities.contains("Hyderabad")); // retursn false
		
		Iterator itr = cities.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
