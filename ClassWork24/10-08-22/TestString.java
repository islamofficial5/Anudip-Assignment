package arrayprograms;

public class TestString
{
	public static void main(String[] args) 
	{
		//Understanding charAt(index no.) method
		String st="Good Mornig";
		//char ch=st.charAt(4);    // will return space
		char ch=st.charAt(5);
		System.out.println(ch);
		
		
		//compareTo() method
		String str="java";
		String str2="java";
		String str3="Java";
		
		System.out.println(str.compareTo(str2));  //it will compare difference between
		System.out.println(str.compareTo(str3)); //their unicode value		
	}
}
