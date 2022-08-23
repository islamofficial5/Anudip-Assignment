package exceptionhandling;

public class ThrowKeywordDemo 
{
	static void validateAge(int age)
	{
		//unchecked exception
//		if(age<18)
//			throw new AgeValidationException("Age is not valid for vote");
//		else
//			System.out.println("age is valid");
//		}
		
		//checked Exception -occurs on compile time
		try
		{
			if(age<18)
				
					throw new AgeValidationException("Age is not valid for vote");
				else
					System.out.println("age is valid");
		}
		catch(AgeValidationException e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) 
	{
//		try
//		{
//			validateAge(12);
//		}
//		catch(AgeValidationException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Thank you for visit");
		
		validateAge(12);
		System.out.println("Thanku for visit");	
	}
}
