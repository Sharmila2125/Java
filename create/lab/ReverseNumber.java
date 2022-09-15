 //Reverse 
 
 class ReverseNumber
 {
	 public static void main(String[] args)
	 {
		 int x=2341,rev=0;
		 while(x!=0)
		 {
			 int remainder=x%10;//remainder=2341%10=1//234%10=4//23%10=3//2%10=2
			 rev=rev*10+ remainder;//reverse=0*10+1=1//1*10+4=14//14*10+3=143//143*10+2=1432
			 x=x/10;//2341/10=234//234/10=23  //23/10=2
		 }
		 System.out.println("The reverse number is" + reverse);
	
	 }
 }	 
		 
		 
		 
		 
	
		
		 