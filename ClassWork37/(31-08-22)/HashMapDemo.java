package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(101, "Islam");
		hmap.put(105, "Suraj");
		hmap.put(102, "Ritesh");
		hmap.put(107, "Sunny");
		
		System.out.println(hmap);
		
//		Set set = hmap.entrySet();
//		Iterator itr = set.iterator();
		
		Iterator itr = hmap.entrySet().iterator();
		
		//Map.Entity interface provides certain method to access the entry in the
		//Map by gaining access to the entry of the map we can easily manipulate them.Map.Entry is generic and defined in java.util package
		
		while(itr.hasNext()) 
		{
			Map.Entry mentry = (Map.Entry)itr.next();
			System.out.println("key: "+mentry.getKey());
			System.out.println("value: "+mentry.getValue());
		}
		
		//get value based on key
		String val= hmap.get(102);
		System.out.println("Value mappded with key: "+val);
		
		//remove value based on key
		hmap.remove(103);
		
		System.out.println(hmap);
		
		System.out.println("after removing key 103");
		for(Map.Entry me:hmap.entrySet())
		{
			System.out.println("key: " +me.getKey());
			System.out.println("value: " +me.getValue());
		}
		
		//sorting HashMap based on key
		Map<Integer, String> tmap = new TreeMap<Integer, String>(hmap);
		for(Map.Entry me:tmap.entrySet())
		{
			System.out.println("key: "+me.getKey());
			System.out.println("value: " +me.getValue());
		}
		System.out.println("size of hashmap: "+hmap.size());
		
		//clear() isEmpty()
		//check key existence
		System.out.println("key present:" +hmap.containsKey(110)); 
		
		//checks value existence
		System.out.println("value present:" +hmap.containsValue("Asif"));
	}
}
