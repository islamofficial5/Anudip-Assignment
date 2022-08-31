package collectionframework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		//object using polymorphism
		List<Integer> list=new ArrayList<Integer>();
		//ArrayList<String> list2=new ArrayList<String>();

		list.add(34);
		list.add(56);
		list.add(34);
		list.add(45);
		//list.add(null);
		System.out.println(list);	//way 1
		System.out.println(list.size());
		list.add(77);
		list.add(99);
		System.out.println("After adding: " +list);
		System.out.println("size after adding: "+list.size());
		
//		//use for loop
//		System.out.println("arraylist using for loop");	//way2
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
//		//using for each loop iterator arraylist
//		System.out.println("for each loop iterator arraylist"); //way3
//		for(Integer in:list)
//		{
//			System.out.println(in);
//		}
//		
//		//using while loop iterator arraylist
//		System.out.println("while loop iterator arraylist");
//		int count=0;
//		while(count<list.size()) //while(list.size()>count)
//		{
//			System.out.println(list.get(count));
//			count++;
//		}
//		
//		//iterator using iterator
//		System.out.println("iterator using iterator");
//		Iterator itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		//sort arraylist in ascending order
		Collections.sort(list);
		System.out.println("after sorting the values are:");
		System.out.println(list);
		
		//sort arraylist in ascending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("after sorting in decending order the values are:");
		System.out.println(list);
		
		list.add(2, 100);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		//copy all arraylist to another
		ArrayList<Integer> des = new ArrayList<Integer>();
		des.addAll(list);
		System.out.println("copied list :" +des);
		
		//sorting the sublist
		List<Integer> sublist1 = list.subList(2, 4);
		System.out.println(sublist1);
		
		//another way
		ArrayList<Integer> sublist2 = new ArrayList<Integer>(list.subList(2, 5));
		System.out.println(sublist2);
		
		//search element
		System.out.println(list.contains(34));
	}
}
