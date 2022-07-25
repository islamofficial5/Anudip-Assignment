//Write a program to count number of digits in a number ex-4556 = 4digits

package basicprograms;
import java.util.*;

public class CountNumOfDigit 
{
	public static void main(String[] args) 
	{
		//declare the variable
		int count=0,num,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		//storing value in temp for future use
		temp=num;
		
		for(;num>0;)
		{
			count++;
			num=num/10;
		}
		System.out.println("Total digits of :"+temp+ " are " +count);
	}
}
