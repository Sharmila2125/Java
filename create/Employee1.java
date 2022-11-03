import java.io.*;

public class Employee1
{
		public static void main(String[] args)throws IOException
        {
			try
			{ 
			FileOutputStream fout=new FileOutputStream{"d:\\emp.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			String s="Employee id:"
			byte b[]=s.getBytes();
			dout.write(b);
			
			String s1="123";
			byte b1[]=s1.getBytes();
			dout.write(b1);
			System.out.prinrln();
			
			String s2="Employee name:";
			byte b2[]=s2.getBytes();
			dout.write(b2);
			
			String s3="Sharmi";
			byte b3[]=s3.getBytes();
			dout.write(b3);
			System.out.prinrln();
			
			String s4="Employee salary:";
			byte b4[]=s4.getBytes();
			dout.write(b4);
			
			String s5="100000";
			byte b5[]=s5.getBytes();
			dout.write(b5);
			System.out.prinrln();
			}
		 
		}
		
}


            
            			