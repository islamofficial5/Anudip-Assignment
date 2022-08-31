package filestream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("F:\\anudipFile\\letter.txt");
			//fos.write(65);
			String s="welcome to java stream";
			
			byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("success");
		}
		catch(Exception e)
		{
			
		}
	}
}
