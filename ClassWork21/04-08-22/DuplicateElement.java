package arrayprograms;
import java.util.Scanner;

public class DuplicateElement 
{
	public static void main(String[] args)
	{
		int arr[],size,i,j,count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		size=sc.nextInt();
				
		//initialize the array
		arr=new int[size];
		System.out.println("Enter " +size + " elements in an array");
		
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//print the array elements
		
		System.out.println("Array elements are");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		//find the duplicate elements in array
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j]) //arr[1]==arr[5] 4==4
				{
				count++;
				break;
				}
			}
		}
	//print all the elements in array
	System.out.println("Total numbers of duplicate elements are "+count);
}
}