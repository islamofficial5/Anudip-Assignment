package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("apple");
		list2.add("orange");
		list2.add("banana");
		
		Collections.sort(list2);
		System.out.println("after sorting: " +list2);
		
		System.out.println(list2.contains("apple"));
		
		//converting arraylist to array
		String arr[] = new String[list2.size()];
		for(int i=0;i<list2.size();i++)
		{
			arr[i]=list2.get(i);
		}
		
		System.out.println("arraylist:" +list2);
		System.out.println("Array elements are: ");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
}
