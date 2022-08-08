package arrayprograms;
import java.util.Scanner;

public class SearchElement
{
	public static void main(String[] args) 
	{
		int size,search,arr[],i;
		boolean flag=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		size=sc.nextInt();
		
		//instanciate array
		arr=new int[size];
		
		//initialize array
		System.out.println("Enter " +size+ " elements in an array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to searching for:");
		search=sc.nextInt();
		
		//found the elements
		for(i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				//pos=i;
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Data found at "+(i+1)+" position");
		}
		else
		{
			System.out.println("Data not found");
		}
		sc.close();
	}

}
