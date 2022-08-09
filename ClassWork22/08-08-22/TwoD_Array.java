package arrayprograms;

import java.util.Scanner;

public class TwoD_Array 
{
	public static void main(String[] args) 
	{
		//compile time initialization
		//int arr[][]= {{1,2,3},{4,5,6,},{7,8,9}};
		
		int arr[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3x3 matrix values:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
