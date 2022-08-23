package exceptionhandling;
import java.util.Scanner;

public class ExceptionDemo
{
	//ArithmeticException
	public void arithmeticException() 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two digit");
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			c=a/b; //try internally throw exception(Arthmetic Exception) object
					//if exception occur
			System.out.println("result : "+c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("you can't devide any number by zero ");
			System.out.println("Exception occer :"+e.getMessage()); //it will print only message
			System.out.println(e); //it will print message and exception name
			e.printStackTrace(); //it will print message,exception type and line no. of exception occer
		}
		System.out.println("rest of the code");
		
	}
	
	//ArrayIndexOutOfBoundsException
	public void indexOutofBound()

	{	int arr[]=new int[5];
	try {
		arr[7]=89;
		System.out.println("result"+ arr[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
	finally 
	{
		System.out.println("Finally block always execute");
		
	}
	System.out.println("rest of code");
		
	}
	
	//NullPointerException
	public void nullPointer()
	{
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Finally block always execute");
			
		}
	}
	
	
	//NumberFormatException
	public void numberFormat()
	{
		String str="hi";
		
		try {
			int i=Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Finally block always execute");
			
		}
	}
	

	
	public static void main(String[] args) 
	{
		ExceptionDemo exception =new ExceptionDemo();
					  exception.arithmeticException();
					  exception.indexOutofBound();
					  exception.nullPointer();
					  exception.numberFormat();
		
		
	}
}
