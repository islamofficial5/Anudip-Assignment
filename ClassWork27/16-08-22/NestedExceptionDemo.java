package exceptionhandling;
import java.util.Scanner;

public class NestedExceptionDemo 
{
	public static void main(String[] args)
	{
		//try with resource 
		try(Scanner sc=new Scanner(System.in);)
		{
			try
			{
				int a=30 , b=0;
				System.out.println(a/b);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println("Rest of code");
			int arr[]=new int[5];
			
			arr[7]=80;
			System.out.println("addition value :"+arr[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : array index is out of bound");
		}
		//while using try with reference we don't need to write finally{}
		
//		finally 
//		{
//			System.out.println("Finally block always execute");
//			
//		}
		
	}

}
