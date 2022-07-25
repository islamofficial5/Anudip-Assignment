package basicprograms;

import java.util.*;

public class StrongNumber
{
	public static void main(String[] args) 
	{
		int i, num, rem, temp, sum = 0, fact;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();

		// store actual variable for future use
		temp = num;

		while (num > 0)
		{
			rem = num % 10;
			fact = 1;
			for (i = 1; i <= rem; i++) 
			{
				fact = fact * i;

			}
			sum += fact;
			num = num / 10;
		}
		if (sum == temp)
			System.out.println(temp + " is a strong number");
		else
			System.out.println(temp + " is not a strong number");
	}

}
