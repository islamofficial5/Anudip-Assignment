package collectionWithObjectClass;

class Person extends Object
{
	int id;
	String name;
	int salary;
	public Person(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
/*	
	 public boolean equals(Object obj)
	 {
		 //if both object has same reference
		 if(this==obj)
			 return true;
		///if para meters is null or both are not same class
		 if(obj==null || this.getClass()!=obj.getClass())
			 return false;
		 
		 //compare using data members
		 Person p=(Person)obj;
		 return this.id==p.id
			&& this.name==p.name
			&& this.salary==p.salary;
	 }
		*/
	
	
	public boolean equals(Object obj)
	{
		Person p=(Person)obj;
		if(this.getName().equalsIgnoreCase(p.getName()))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		//return this.name.length()%10;
		return this.id%10;
	}	
}
public class EqualAndHashCode 
{
	public static void main(String[] args) 
	{
		/*
		String st1="welcome";
		String st2="welcome";
		
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		*/
		
		Person p1=new Person(101, "nilanjan", 30000);
		Person p2=new Person(101, "nilanjan", 30000);
		Person p3=p1;
		
		if(p1.hashCode()==p3.hashCode())
		{
			System.out.println(p1.equals(p3));
		}
		else
			System.out.println("not equals");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}
	
//	Student s1=new Student(101, "nil", 12, 12345678);
//	Student s2=new Student(102, "somya", 20, 9876543);
//			s1.equals(12);
//	
}
