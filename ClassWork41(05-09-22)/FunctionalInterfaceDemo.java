package java8features;

interface parent
{
	//void show();  //ex-invalid functional interface
	default void hi() {}
}


@FunctionalInterface   //it allows only one interface method .
//if parent interface has abstract method then we can't use that interface in Functional Interface
interface message extends parent
{
	void say();   //by default it is public and abstract
	
	default void msg()
	{
		System.out.println("default with method body");
	}
}

 

public class FunctionalInterfaceDemo implements message
{
	@Override
	public void say() 
	{
		System.out.println("saying hello");
	}
		
public static void main(String[] args) 
		{
			FunctionalInterfaceDemo demo=new  FunctionalInterfaceDemo ();
									demo.msg();
									demo.say();
		}
}


/*
  	Functional interface-an interface that contains exactly one abstract method is know 
  	as functional interface. it can have any number of default, static method but can
  	contain only one abstract method. it can also declare method of object class.
  	
  	 it also know as single abstract method interface or SAM interface. it helps to 
  	 achieve functional programming approach.
  	 
  	 invalid functional interface- A function interface can extends another interface
  	 only when it does not have any abstract method.
 */
