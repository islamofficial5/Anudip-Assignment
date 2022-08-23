package multithreading;

public class DeadlockDemo
{
	public static void main(String[] args)
	{
		final String resource1="paper";
		final String resource2="pen";
		
		//Thread 1 : Monalisa lock resource1: paper and wanted to lock resource2:pen
		
		Thread monalisa = new Thread()
		{
			public void run()
			{
				synchronized (resource1)
				{
					System.out.println("Monalisa lockecd Resource 1: paper");
					
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
					//Thread 1:Monalisa is trying to lock resource 2:pen
					synchronized (resource2)
					{
						System.out.println("wanted to locked Resource 2: pen");
					}
				}
			}
				};
				//Thread 2 :Islam lock resource2: pen
				
				Thread islam = new Thread()
				{
					public void run()
					{
						synchronized (resource2)
						{
							System.out.println("Islam lockecd Resource 2: pen");
							
							try
							{
								Thread.sleep(100);
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
							
							//Thread 1: Islam is trying to lock resource 1:paper
							synchronized (resource1)
							{
								System.out.println("wanted to locked Resource 1:paper");
							}
						}
					}
						};
						
						monalisa.start();
						islam.start();
			}
	}

