package filestream;
import java.io.FileInputStream;

public class FileInputStreamDemo
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("F:\\anudipFile\\letter.txt");
			int i;
			System.out.println("number of remaining bytes " +fis.available());
			
//			while((i=fis.read())!=-1)
//			{
//				System.out.println((char)i);
//			}
			fis.read();
			fis.read();
			fis.read();
			fis.read();
			System.out.println("number of remaining bytes " +fis.available());
			fis.close();
		}
		catch(Exception e)
		{
			
		}
	}
}
