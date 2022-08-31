package filestream;
import java.io.FileReader;

public class FileReaderDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader fr = new FileReader("F:\\anudipFile\\letter.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("success");
	}
}
