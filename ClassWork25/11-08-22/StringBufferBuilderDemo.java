package arrayprograms;

public class StringBufferBuilderDemo 
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
		System.out.println(name.indexOf('o'));
		System.out.println(name.indexOf('o',4));
		System.out.println(name.hashCode());
		
		String str1=new String("Welcome");//2 objects and one reference variable will create
		String str2=new String("Welcome");
		System.out.println(str1==str2);
		
		//using StringBuilder
		StringBuilder builder = new StringBuilder("Hello World");
		System.out.println(builder);
		builder.append(" I am learning string");
		System.out.println(builder);
		//builder.reverse();
		System.out.println(builder);
		builder.insert(25, " java ");
		System.out.println(builder);
		builder.insert(1, " hi ");
		System.out.println(builder);
		
		
		//using StringBuffer 
		StringBuffer buffer = new StringBuffer("Hello Java");
		buffer.append(" World");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		char ch1 =buffer.charAt(4);
		System.out.println("Character :"+ch1);
		System.out.println(buffer.indexOf("ello"));
		
		System.out.println(buffer.substring(6));
		System.out.println(buffer.substring(6, 10));
		buffer.delete(6, 10);
		System.out.println(buffer);
		buffer.deleteCharAt(5);
		System.out.println(buffer);
	}
}
