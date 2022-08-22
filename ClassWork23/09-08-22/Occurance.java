//Wap to count no of occurance of given character.Ex- good morning Char=O No of occurance: 3

package arrayprograms;

public class Occurance 
{
	public static int count(String str)
	{
	int i ,count=0;
	char ch;
	for(i=0; i<str.length(); i++)
	{
		ch=str.charAt(i);
		
		if(ch=='o'||ch=='O')
		{
			count++;
		}
	}
		return count;
}
	public static void main(String[] args) 
	{
		String str="Good Moring";
		
		int count=count(str);
		System.out.println("O occers "+count +" times in "+ str);
	}
	
}
