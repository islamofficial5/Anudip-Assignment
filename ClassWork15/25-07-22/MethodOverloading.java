package oopsprograms;

class Addition
{
	public void add(int a)
	{
		System.out.println("Addition value of one parameter:"+(a+10));
	}
	
public void add(int a, int b, int c)
{
	System.out.println("Addition value of one parameter:" +(a+b+c));
}

public void add(int a, double b)
{
	System.out.println("Addition value of one parameter(int,double):" +(a+b));
}

public void add(double b, int a)
{
	System.out.println("Addition value of one parameter(double,int):" +(a+b));
}
}
public class MethodOverloading
{
	public static void main(String[] args)
	{
		Addition a = new Addition();
		a.add(12.3, 34);
		a.add(100);
		a.add(12, 23, 10);
		a.add(12, 12.50);
		a.add(12.33, 44);
	}
}


