//To input 5 subject marks for 5 students and calculate total,avg,result using arrays?



import java.util.Scanner;
    class Student

{ 

 Scanner sc=new Scanner(System.in);

   int Total=0, subjects;

   String name;

   int marks[];
   int avg;
   int sum;

   Student()

   {

     

      System.out.print("Enter Student Name: ");

      name=sc.next();;

      getDisMarks();

   }

   public void getDisMarks()

   {

       marks=new int[5];
       

       System.out.print("Enter marks of Physics: ");

       marks[0]=sc.nextInt();

       System.out.print("Enter marks of Chemistry: ");

       marks[1]=sc.nextInt();

       System.out.print("Enter marks of Maths: ");

       marks[2]=sc.nextInt();
       
        System.out.print("Enter marks of Physics: ");

       marks[3]=sc.nextInt();
       
        System.out.print("Enter marks of english: ");

       marks[4]=sc.nextInt();
       
 
        System.out.print("Enter marks of Tamil: ");

       marks[4]=sc.nextInt();
        
       for(int i=0;i<5;i++) {
    	   if(marks[i]>=40) {
    		   System.out.println("subject result is passed="+marks[i]);
    		   
    	   }
    	   else {
    		   System.out.println("Subject  result is failed="+marks[i]);
    	   }
       }


       
     //  for( int i=0;i<5;i++)
//{
         sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
         avg=sum/5;

System.out.println(" average marks of Student"+avg);
//}


       for(int i=0;i<5;i++)

       {

          Total+=marks[i];

       }

       System.out.println("Total Marks of student "+name+": "+ Total);

   }







    public static void main(String args[])

    {

        Student s[]=new Student[5];

        for(int i=0;i<5;i++)

              s[i]=new Student();

     }

}
	
