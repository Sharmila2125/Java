//To calculate sum of two numbers function if my input char is 'y' [yes] to continue again otherwise to stop process?
 import java.util.Scanner;
class CalculateSum
{
	
		

	
		public static void main(String args[])  
		{  
		int x, y, sum;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");  
		x = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		y = sc.nextInt();  
		sum = x+y;  
		System.out.println("The sum of two numbers x and y is: " + sum);  
		System.out.print("DO you to continue Y/N: ");
		
	   char answer= sc.next().charAt(0);
	    
	  for(int i=0;i<5;i++) {
		  
	  
	    if (answer ==  'y' || answer == 'Y')
	    {
	    	
	    	
			
			System.out.print("Enter the first number: ");  
			x = sc.nextInt();  
			System.out.print("Enter the second number: ");  
			y = sc.nextInt();  
			sum = x+y;  
			System.out.println("The sum of two numbers x and y is: " + sum);  
	    	
	    	
	    	
	        
	    }
	    else if (answer == 'N' || answer == 'n')
	    	
	    {
	    System.out.print("sum is exist ");
	    	break;
	    	 }
	  }
	  

		
	   
		}
		public static  int sum(int x, int y)  
		{ 
			int count=0;
		int sum = x + y;  
		
		  return sum;
		  }
		
} 
	