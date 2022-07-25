//Write a program to find reverse of number 
//ex- 1234  reverse- 4321
package basicprograms;
import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int n,rem,reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse");
		n=sc.nextInt();
		
		while(n>0)
		{
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		System.out.println("reverse number: " +reverse);
	}
}
