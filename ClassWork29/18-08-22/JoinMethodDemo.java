public class JoinMethodDemo extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=5; i++)
		{
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		
			
			System.out.println(i+" "+Thread.currentThread().getName()+"Priority: "+
			Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args)
	{
		JoinMethodDemo t1=new JoinMethodDemo();
		JoinMethodDemo t2=new JoinMethodDemo();
		JoinMethodDemo t3=new JoinMethodDemo();
		JoinMethodDemo t4=new JoinMethodDemo();
		//we can set name the thread using setName()
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		
		//giving priority
		
		t1.setPriority(MAX_PRIORITY);  //10
		t2.setPriority(NORM_PRIORITY); //5
		t3.setPriority(MIN_PRIORITY);  //1
		t4.setPriority(7);  //7   always set priority between 1 to 10 only
		
		t1.start();
	try
	{
		t1.join(4000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
		t2.start();
		t3.start();
		
		
	}


}
