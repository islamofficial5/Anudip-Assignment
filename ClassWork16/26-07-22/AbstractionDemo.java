package abstractionDemo;

//We can't create Instance but we can create reference variable
abstract class Bankk
{
	//abstract method-method has no body
	abstract public void getLoanInterest();
		
	//concrete method - method has body
	public void display()
	{
		System.out.println("This is a Bank class");
	}
}
class SBI extends Bankk
{
	@Override
	public void getLoanInterest()
	{
		System.out.println("We are Providing 6.75 intrest");
	}		
}

class AXIS extends Bankk
{
	@Override
	public void getLoanInterest()
	{
		System.out.println("We are Providing 10% intrest");	
	}		
	
public static void main(String[] args) 
{
		//we can't create parent class object but can declare parent class variable
		// we can create child class object and declare with child/parent class variable
		Bankk bank;
		bank=new SBI();
		bank.display();
		bank.getLoanInterest();
		
		
		bank=new AXIS();
		bank.display();
		bank.getLoanInterest();	
	}
}
