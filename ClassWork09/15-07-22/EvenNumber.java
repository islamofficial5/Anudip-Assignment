//Print Even number
package basicprograms;
import java.util.*;
public class EvenNumber 
{

	public static void main(String[] args)
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		n=sc.nextInt();
		
		System.out.println("The even number in between 1 to " +n + "are");
		for(i=1;i<=n;i++) //2 4
		{
			if(i%2==0) //2%2,4%2
				System.out.println(i); //2 4
		}
	}
}
