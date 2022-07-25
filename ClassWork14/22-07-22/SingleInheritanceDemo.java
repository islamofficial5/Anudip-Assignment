package oopsprograms;


// Super/parent/base
class User
{
	int id;
	String name, address;

	public void setData(int id, String name, String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void Display()
	{
		System.out.println("Id :" + this.id);
		System.out.println("Name :" + this.name);
		System.out.println("Address :" + this.address);
	}
}

	// Sub/child/derived

class Employees extends User
{
	double salary;
	String designation;

	public void setData(int id, String name, String address, double salary, String designation) 
	{
		super.setData(id, name, address); // parent class setData
		this.salary = salary;
		this.designation = designation;
	}

	public void Display() 
	{
		super.Display();
		System.out.println("Salary: " + this.salary);
		System.out.println("Designation: " + this.designation);
	}

}

public class SingleInheritanceDemo 
{
	public static void main(String[] args) 
	{
		Employees emp=new Employees();
		emp.setData(101, "Islam","Dhanbad", 25000, "SE");
		emp.Display();	 					
	}
}
