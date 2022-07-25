//Write a program to print multiplication table of given number ex. 5
package basicprograms;
import java.util.*;

public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		int n=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit:");
		n=sc.nextInt();
		
		System.out.println("The Multiplication of: " +n);
		for(int i=1;i<=10;i++)
		{
			   System.out.println(n+" * "+i+" = "+n*i);
		}
		sc.close();
	}
}
