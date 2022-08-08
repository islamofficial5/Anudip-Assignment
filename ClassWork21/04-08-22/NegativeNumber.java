//wap to find out all negative numbers from an array and print those negative numbers
package arrayprograms;

public class NegativeNumber
{
	public static void main(String[] args)
	{
		int arr[]= {-2,3,4-8,-9,5,6,-12,44,-12};
		System.out.println("Negative numbers:");
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{ }
			else
			{
				System.out.println(arr[i]+ " ");
			}
		}
		
		System.out.println("Positive numbers:");
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<0)
			{ }
			else
			{
				System.out.println(arr[i]+ " ");
			}
		}
	}
}
