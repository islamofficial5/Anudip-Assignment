package oopsprograms;

public class Student
{
	//instance variable
		int id;
		String name,address;
		long phno;
		
	//Static Variable
		 static	String institute="Anudip";
		
		//parameterized Constructor
		
		public Student(int id , String name , String address, long phno )
		{
			//when instance variable 
			this.id=id;
			this.name=name;
			this.address=address;
			this.phno=phno;
			
		}
		
		public void display()
		{
			System.out.println("Welcome "+this.name);
		}
		
		public void getData()
		{
			//this.display();
			display(); //compiler will change this line with this.display();
			System.out.println(" id:"+id+" Name:"+name+" addreass:"+address
					+" PhNo:"+phno+" Institute Name:"+institute);
		}
		
		public static void main(String[] args)
		{
				Student std1=new Student(101,"Suraj", "Dhanbad",95643543);
				std1.getData();
				
				Student std2=new Student(102,"Anand", "bihar",95643543);
				std2.getData();
		}

}
