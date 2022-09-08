package java8features;

public class LambdaWithThread 
{
	public static void main(String[] args) 
	{
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("thread is running");
				
			}
			
		};
		
		Thread t1=new Thread(r);
		t1.start();
		
		//with lambda
		Runnable r2=()->
		{
			System.out.println("Thread 2 is running");
		};
		Thread t2=new Thread(r2);
		t2.start();
	}
	

}
