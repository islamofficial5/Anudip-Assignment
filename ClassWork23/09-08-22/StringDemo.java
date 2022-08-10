package arrayprograms;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String name="Islam";
		String name2="Islam";
		String str="welcome";
		
		System.out.println(name==name2);
		System.out.println(name==str);
		name.concat("Ansari");
		System.out.println(name);  //because string is immutable
		
		System.out.println(name.concat(" Ansari"));
		
		name=name.concat(" Islam Anasri ");
		System.out.println(name);
		
		
		//Understanding charAt(index no.) method
		String st="Good Mornig";
		//char ch=st.charAt(4);    // will return space
		char ch=st.charAt(5);
		System.out.println(ch);
		
	}
}
