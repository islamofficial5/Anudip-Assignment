package basicprograms;
import  java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		int number,count=0, sum=0,rem,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check armstrong or not");
		number=sc.nextInt();
		
		//store actual number for future use	
		temp=number;
		
		//count no of digits
		while(number>0)
		{
			count++;
			number=number/10;
		}
		//again assign the value from temp to number as number becomes zero
		number=temp;
		
		//calculate Armstrong number
		while(number>0)
		{
			rem=number%10;
			sum+=Math.pow(rem,count);
			number = number/10;
		}
		if(sum==temp)
				System.out.println(temp+" is an armstrong number");
			else
				System.out.println(temp+" is not an armstrong number");
	}
}
