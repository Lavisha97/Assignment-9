import java.util.InputMismatchException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;

class Files
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("E:\\Assignment 9\\abc.txt");
		FileReader in = null;
		FileWriter out=new FileWriter("E:\\Assignment 9\\xyz.txt");
		try
		{
			int ch;
			String str="";
			in=new FileReader(f);
			while((ch=in.read())!= -1)
			{
				System.out.print((char)ch);
				str=str+(char)ch;
			}
			char a[]=str.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				out.write(a[i]);
			}
			out.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Incorrect");
		}
		{
			if(in!=null)
			in.close();
		}
	}
}