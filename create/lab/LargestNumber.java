//largest number
public class LargestNumber{
public static int larNum(int x,int y,int z){
      if (x >= y && x >= z)
	  {
		  System.out.println("The largest number is x");
        return x;
       }
      else if(y >= x && y >= z)
	  {
         System.out.println(" The largest number is y");
        
		 return y;
       }
       else
	   {
		   System.out.println("The largest number is z");
       
		   
         return z;
       }
 
 
}

public static void main(String[]args){
       int x=10;
	   int y=3;
	   int z=5;
	   int  Largest=larNum(x,y,z);
	   System.out.println(" The largest number is="+ Largest);
}
}