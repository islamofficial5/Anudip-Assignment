package multithreading;

//shared class
class PrintData
{
	static synchronized void multiplication(int n) 
	{
		System.out.println("outside of synchronized block");
			
		
		for(int i=1 ;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		} //end of for
			System.out.println("rest of code which is not to synchronized");
	}
}

class Thread1 extends Thread
{
	PrintData t;
	
	public Thread1(PrintData t)
	{
		this.t=t;
	}
	public void run()
	{
		t.multiplication(5);
	}
}

class Thread2 extends Thread
{
	PrintData t;
	
	public Thread2(PrintData t)
	{
		this.t=t;
	}
	public void run()
	{
		t.multiplication(100);
	}
}

public class SynchronizationDemo 
{
	public static void main(String[] args) 
	{
		//only one object ofPrintData class
		PrintData pd = new PrintData();
		
		//two Thread object which will share above object
		
		//anonymous class
		Thread t1= new Thread()
				{
					public void run()
					{
						PrintData.multiplication(1);
					}
				};
				
		Thread t2 = new Thread()
				{
					public void run()
					{
						PrintData.multiplication(5);
					}
				};
				
		Thread t3 = new Thread()
				{
					public void run()
					{
						PrintData.multiplication(1);
					}
				};
				
		Thread t4 = new Thread()
				{
					public void run()
					{
						PrintData.multiplication(5000);
					}
				};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
