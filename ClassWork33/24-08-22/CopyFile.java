package filestream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile 
{
	public static void main(String[] args)
	{
		FileInputStream fs = null;
		FileOutputStream fo = null;
		
		try
		{
			fs=new FileInputStream("F:\\anudipFile\\letter.txt");
			fo=new FileOutputStream("F:\\anudipFile\\dest.txt");
			
			int i;
			
			while((i=fs.read())!=-1)
			{
				fo.write(i);
			}
			System.out.println("copied file successfully");
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try
			{
				if(fs!=null)
					fs.close();
				if(fo!=null)
					fo.close();		
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
