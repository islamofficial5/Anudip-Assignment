package java8features;

interface data
{
	int addition(int a , int b);
}
public class AdditionWithLambda 
{
	public static void main(String[] args) 
	{
		data d=(a,b)->(a+b);
		System.out.println("Addition: "+d.addition(10, 20));
		
		data d1=(int a,int b)->(a+b);
		System.out.println("Addition: "+d.addition(20, 20));
		
		
		//with return type

		data d3=(int a,int b)->
		{
		int c=(a+b);	
		return c;
		};
		System.out.println("Addition: "+d.addition(30, 20));
	}
}
