//Write a program to calculate sum of natural number from 1 to n.
//1 to 5 1+2+3+4+5=15
package basicprograms;
import java.util.Scanner;

public class NaturalNumber
{
	public static void main(String[] args) 
	{
		int i ,num,sum=0;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Natural Number");
		num=sc.nextInt();
			
		for(i=1 ; i<=num; i++)
		{
			sum=sum+i;
		}//loop end
		System.out.println("Sum of given Natural Number is "+sum);
	}

}

