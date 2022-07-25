//Write a program to calculate factorial number from 1 to n.
//5! =1*2*3*4*5=120
package basicprograms;
import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int i ,num,fact=1; //Variable for loop
			
		Scanner sc=new Scanner(System.in); // creating Scanner Object
		System.out.println("Enter a  Number");
		num=sc.nextInt();
			
		for(i=1;i<=num;i++)
		{    
			fact=fact*i;    
		} 	   
			System.out.println("Factorial of "  +num+ " is " +fact);
		}
}
