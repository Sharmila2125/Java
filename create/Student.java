// Scanner class
import java.util.Scanner;
 public class Student  
{
   public static void main(String[] args)
   { 
    
	  int id;
	  String name;
	  double att;
	  System.out.println("enter student details");
	  Scanner sc=new Scanner(System.in);
	  id=sc.nextInt();
	  name=sc.next();
	  att=sc.nextDouble();
	  System.out.println( " student id =" +id+", "+"student name ="+ name+","+ "student att ="+att);
	  
	}
}	