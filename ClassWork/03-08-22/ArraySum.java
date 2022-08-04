package arrayprograms;
import java.util.Scanner;

public class ArraySum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elements of an array:");
		 int [] arr = new int [] {1,2,3,4,5};  
	     int sum = 0;   
	     for (int i = 0; i < arr.length; i++) 
	     {  
	    	 arr[i]=sc.nextInt();
	    	 sum = sum + arr[i];  
	     }  
	        System.out.println("Sum of 5 elements of an array are: " + sum);
	        sc.close();
	}
}
