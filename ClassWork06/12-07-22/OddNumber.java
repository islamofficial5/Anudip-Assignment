//Check the number is odd
package basicprograms;
import java.util.*;

public class OddNumber
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		n=sc.nextInt();
		
		System.out.println("The odd number in between 1 to " +n + " are");
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.println(i); 
		}
	}
}

