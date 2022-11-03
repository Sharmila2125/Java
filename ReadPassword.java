//To prepare console class with password method
import java.io.*;
class ReadPassword
{
	public static void main(String[] args)
	{
		Console c=System.console();
		System.out.println(" Enter Password ");
		char[] ch=c.readPassword();
		String pass=String.valueOf(ch);
		System.out.println(" Password is :" +pass);
	}
}