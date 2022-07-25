//Write a program to count number of odd number from 1 to n.
package basicprograms;

import java.util.Scanner;

public class CountOddNum
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int num, i;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		num = sc.nextInt();	
		for(i = 1; i <= num; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i); 
			}
		}	
		sc.close();
	}
}