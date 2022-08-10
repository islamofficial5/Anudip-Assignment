//Write a program to count no. of vowel present in string ex. good morning no.of words 4
package arrayprograms;

public class CountVowels
{
	public static int countVowel(String str)
	{
		int i, count=0;
		char ch;
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' ||ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		String str = "I am learning java String";
		//int count=countVowel(str);
		//System.out.println("no. of vowels: "+count);
		System.out.println("no. of vowels: "+countVowel(str));
	}
}
