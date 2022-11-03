//Write a program with File Reader AND File Writer Classes:

import java.io.*;
public class FileReaderWriter 
{
	public static void main(String[] args)throws IOException
	{
		FileWriter fw=new FileWriter("d:\\\file1.txt");
		fw.write(" Hello All");
		FileReader fr=new FileReader("d:\\file1.txt");
		int i;
		while((i=fr.read())i=-1)
		System.out.println((char)i);
	     fr.close();
		 fw.close();
		 System.out.println("Success");
		 
	}
}
