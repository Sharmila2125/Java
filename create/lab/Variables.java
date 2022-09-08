public class Variables   
{  
    static int m=100;//static variable  
    
public static int add()
{

	int a=5;
	int b=10;
	int sum = a + b;
 System.out.println("the sum is: " + sum);
	
	return sum;
}

    public static void main(String args[])  
    {  
	
        int data=50;//instance variable 
System.out.println(m+data);	
 Variables.add();
	
		
    } 
}	