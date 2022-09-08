// import operators 

class Operators

{

  public static void main(String[] args)
  {
     int x,y,add,sub,sum=0;
	 x=10;
	 y=20;
	 add=x+y;//Arithmetic Operators
	 sub=y-x;
	  sum+=add;//Assignment Operators
	 System.out.println(add+" "+" "+sub);
	 System.out.println(sum);
	 if( add==30||sub==10)//Relational Operators//Logical Operators
	 {
		 System.out.println("test is passed");
	 } 
	 System.out.println("x&b = " + (x & y));//Bitwise Operators
 
	 System.out.println( ++x);// Unary Operators
	 
	 }
	}
