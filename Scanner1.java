// To input int,String,Double,Boolean details using scanner class.
import java.util.Scanner;
public class Scanner1
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println(" Enter integer value: ");
			int n=sc.nextInt();
			System.out.println(" Enter name :");
			String s=sc.next();
			System.out.println(" Enter double value: ");
			double d=sc.nextDouble();
			System.out.println(" Enter boolean value :");
			boolean b=sc.nextBoolean();
		}
}
