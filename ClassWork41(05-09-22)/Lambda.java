package java8features;

@FunctionalInterface
interface sayable
{
	String msgs(String message);
	//void msg();
	default void show()
	{
		System.out.println("Hi");
	}
}
public class LambdaDemo
{
	public static void main(String[] args)
	{
		//without Lambda Expression
//		sayable s=new sayable() {
//			
//			@Override
//			public void msg() {
//				
//				System.out.println("hello Java");
//			}
//		};
//		
//		s.msg();
		
		//with Lambda Expression
		
		//Syntax--- interfaceName ref =() -> {};  //if there is only sinle statement no need to
		//give body and enclose with ;
		//if there is any return statement so compulsory we need to give body {}and enclose with ;
		
		
//		sayable s= () -> System.out.println("hello java");
//		s.msg();
//		s.show();
		
		
		sayable s=(message)->
		{
			return "Hello, "+message; 
		};
		System.out.println(s.msgs(" how are you?"));
		
		
		sayable s1=message->
		{
			return "Hi, "+message; 
		};
		System.out.println(s1.msgs(" what are you doing"));
		
	}

}
