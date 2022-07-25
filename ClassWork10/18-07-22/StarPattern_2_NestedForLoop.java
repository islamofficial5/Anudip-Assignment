package basicprograms;
import java.util.Scanner;

public class StarPattern_2_NestedForLoop 
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows:");
		n=sc.nextInt();
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");			
			}
			System.out.println();
		}
	}
}
