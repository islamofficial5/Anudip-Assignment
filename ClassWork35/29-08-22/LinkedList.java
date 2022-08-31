package collectionframework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		//polymorphic object
		LinkedList<String> names=new LinkedList<String>();
		
		//List<String>  names=new LinkedList<String>();
		
		names.add("Suraj");
		names.add("Islam");
		names.add("Ritesh");
		names.add("Sagar");
		names.add("Sunny");
		
		System.out.println(names);
		System.out.println("=================================");
		
		//using for Each Loop
		System.out.println("Using for-each Loop");
		for(String s: names)
		  {
			System.out.println(s);
		  }
		System.out.println("=================================");
		
		//using while loop
		System.out.println("Using while loop");
		int count=0;
		while(count<names.size())
		 {
			System.out.println(names.get(count));
			count++;
		 }
		System.out.println("=================================");
          
		//using Iterator
		System.out.println("using iterator");
		Iterator itr=names.iterator();
		while(itr.hasNext())
		 {
			System.out.println(itr.next());
		 }
		System.out.println("=================================");
		
		//adding elements
		names.addFirst("first");
        names.addLast("last");
        names.add(2,"chandan");
        System.out.println("After Adding"+names);
        
        //remove operations
        names.removeLast();
        names.removeFirst();
        names.remove(1);
        names.remove("Sunny");
        System.out.println("After removing :"+names);
        //names.clear();
        //System.out.println(names);
        System.out.println("=================================");
        
        //Using ListIterator
        ListIterator listit=names.listIterator();
        System.out.println("Forward direction");
        while(listit.hasNext())
        {
        	System.out.println(listit.next());
        }
        
