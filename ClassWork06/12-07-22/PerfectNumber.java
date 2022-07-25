package basicprograms;
import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] args) 
	{
		int number,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check perfect number or not?");
		number = sc.nextInt();	//6
		
		for(i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;	//sum+=i;
			}
		}//loop end
		if(number==sum)
			System.out.println(number+ " is a perfect number");
		else
				System.out.println(number+ " is not a perfect number");
	} 
}
