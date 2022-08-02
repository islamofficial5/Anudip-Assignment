package abstractionDemo;

interface Drawblee
{
	void draw();
	default void message()
	{
		System.out.println("since java 8, we can specify method body using default");
	}
	
	static int multiply(int a,int b)
	{
		return a*b;
	}
}

class Circle implements Drawblee
{
	@Override
	public void draw()
	{
		System.out.println("Drawing circle");
	}
}

public class DefaultMethodDemo
{
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		circle.draw();
		circle.message();
	}
}
