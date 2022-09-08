package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person
{
	int id;
	String name;
	int age;
	double salary;
	
	public Person(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}	
}

public class LambdaWithComparator 
{
	
	public static void main(String[] args) {
		List<Person> person=new ArrayList<Person>();
		
		person.add(new Person(101, "Suraj",25,30000));
		person.add(new Person(102, "Ritesh",24,25000));
		person.add(new Person(103, "Islam",23,28000));
		
		
		//sorting by name
		System.out.println("sorting by name");
		Collections.sort(person, (p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		//print
		person.forEach((p)->
				{
					System.out.println(p);
				});
		System.out.println("------------------------------");
		
		//sorting by id
				System.out.println("sorting by id");
				Collections.sort(person, (p1,p2)->{
					if(p1.id==p2.id)
						return 0;
						else if(p1.id>p2.id)
							return 1;
						else
							return -1;
				});
				
				//print
				person.forEach((p)->
						{
							System.out.println(p);
						});
				System.out.println("------------------------------");
				
				//sorting by age
				System.out.println("sorting by age");
				Collections.sort(person, (p1,p2)->{
					if(p1.age==p2.age)
						return 0;
						else if(p1.age>p2.age)
							return 1;
						else
							return -1;
				});
				
				//print
				person.forEach((p)->
						{
							System.out.println(p);
						});
				System.out.println("------------------------------");
				
				//sorting by salary
				System.out.println("sorting by salary");
				Collections.sort(person, (p1,p2)->{
					if(p1.salary==p2.salary)
						return 0;
						else if(p1.salary>p2.salary)
							return 1;
						else
							return -1;
				});
				
				//print
				person.forEach((p)->
						{
							System.out.println(p);
						});
				System.out.println("------------------------------");
	}
}
