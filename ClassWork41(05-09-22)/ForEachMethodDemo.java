package java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodDemo
{
	public static void main(String[] args)
	{
	List<String> list=new ArrayList<String>();
			list.add("Islam");
			list.add("Suraj");
			list.add("Shakib");
			list.add("Virat");
	
	//by for each loop
	//for(String s:list) {System.out.println(s);}
	
	//by for each method with lambda
	
			list.forEach(
					(s)->System.out.println(s)
					);
	}
					
}
