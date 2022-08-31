package wrapperclass;

public class WrapperClassDemo
{
	public static void main(String[] args) 
	{
		int a=30;
		
		//converting int (primitive) to Integer(Object) explicitly
		
		Integer i=Integer.valueOf(a);
		System.out.println(a);
		
		//autoboxing ,now compiler will automatically 
		//convert int to Integer by writing Integer.valueOf(a)
		
		Integer i1=a;
		System.out.println(i1);
		
		short b=20;
		Short s=b;		
		System.out.println(s);
		
		
		
		//Converting Integer(object) to int(primitive)
		Integer in= new Integer(60);
		
		//Converting Integer(object) to int(primitive) explicitly
		int c=in.intValue();
		
		System.out.println(c);

		//autoUnboxing ,now compiler will automatically 
		//convert  Integer to int by writing in.intValue();
		
		int j=in;
		System.out.println(j);
		
	}
}
