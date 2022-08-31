package filestream;
import java.io.FileWriter;

public class FileWriterDemo
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("F:\\anudipFile\\letter.txt");	//file-path and \\ created text(letter) file.txt
			fw.write("we are learning file writer");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("success");
	}
}
