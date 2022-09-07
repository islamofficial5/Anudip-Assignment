package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Islam", 10));
		list.add(new Student(102, "Suraj", 1));
		list.add(new Student(103, "Ritesh", 2));
		list.add(new Student(104, "Sunny", 4));
		
		System.out.println("sorting by name");
		Collections.sort(list, new NameComparator());
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Student s = (Student)itr.next();
			System.out.println(s.id+ " " +s.name+ " " +s.rollno);
		}
		
		System.out.println("sorting by age");
		Collections.sort(list, new RollNoComparator());
		
		Iterator itr1 = list.iterator();
		while(itr1.hasNext())
		{
			Student s= (Student)itr1.next();
			System.out.println(s.id+ " " +s.name+ " "+s.rollno);
		}
	}
}
