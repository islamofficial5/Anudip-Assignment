package basicprograms;

public class SwitchExample1
{
	public static void main(String[] args)
	{
		int choice=2;
		
		switch(choice)	//switch=2
		{
		case 1: 
			System.out.println("This is case 1");
			break;
			
		case 2:
			System.out.println("This is case 2");
			break;
			
		case 3:
			System.out.println("This is case 3");
			break;
			
		default:
			System.out.println("wrong choice");
		}//end of switch
		
		System.out.println("end of switch");
	}
}
