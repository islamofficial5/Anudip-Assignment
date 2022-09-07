package collectionframework;

import java.util.Map;

import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		
		//creating  employee objects
		Employee emp1 = new Employee(101, "Islam");
		Employee emp2 = new Employee(102, "Suraj");
		Employee emp3 = new Employee(103, "Ritesh");
		Employee emp4 = new Employee(104, "Sunny");

		//storing employee info in hashmap
		empMap.put(emp1.getEmpId(), emp1);
		empMap.put(emp2.getEmpId(), emp2);
		empMap.put(emp3.getEmpId(), emp3);
		empMap.put(emp4.getEmpId(), emp4);
		
		
		//2nd way to reduce boiler plate code
//		System.out.println("2nd way");
//		empMap.put(1, new Employee(101, "Islam"));
//		empMap.put(2, new Employee(102, "Suraj"));
//		empMap.put(3, new Employee(103, "Ritesh"));
//		empMap.put(4, new Employee(104, "Sunny"));
		
		// for displaying
		Set<Map.Entry<Integer, Employee>> employees = empMap.entrySet();
		
		for(Map.Entry<Integer, Employee> em:employees)
		{
			//System.out.println("key: "+em.getKey());
			Employee employee = (Employee) em.getValue();
			employee.display();
		}
		
		//Iterator
		System.out.println();
		System.out.println("======After iterator======");
		Iterator itr = empMap.keySet().iterator();
		while(itr.hasNext())
		{
			Employee emp = empMap.get(itr.next());
			emp.display();
		}
	}
}
