package multithreading;

class Account
{
	int accBalance=10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("start withdrawing");
		if(this.accBalance<amount)
		{
			System.out.println("less balance: waiting for deposite");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		this.accBalance=accBalance-amount;
		System.out.println(amount+ " rs withdraw has done successfully");
	}
	synchronized void deposite(int amount)
	{
		System.out.println("starting deposite");
		this.accBalance=accBalance+amount;
		System.out.println(amount+" is deposite completed");
		//notify();
		notifyAll();
	}
	
	//displayAccBalance()
	synchronized void display(int amount)
	{
		try
		{
			wait(400);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("total balance is " +this.accBalance);
	}
}

public class InterThreadCommunication 
{
	public static void main(String[] args)
	{
		Account acc = new Account();
		new Thread()
		{
			public void run()
			{
				acc.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				acc.deposite(20000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				acc.display(2000);
			}
		}.start();
		 
	}
}
