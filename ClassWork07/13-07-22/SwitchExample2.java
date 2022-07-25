package basicprograms;

public class SwitchExample2
{
	public static void main(String[] args) 
	{
		char c='I';
		
		switch(c)	//switch(2)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c+ " is a vowel" );
			break;
			
		default:
			System.out.println(c+ " is a consonant");
		}//end of switch case
		
		System.out.println("end of switch");
	}
}
