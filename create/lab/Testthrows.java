//To prepare Exception using 'throw' and 'throws' keywords:


import java.io.IOException; 
class Testthrows
{ 
 void m()throws IOException
{ 
 throw new IOException("device error");
 } 
 void n()throws IOException
{ 
 m(); 
 } 

 void p()
{ 
 try
{ 
 n(); 
 }
catch(Exception e)
{
System.out.println("exception handled");
} 
 } 
public static void main(String args[])
{ 
 Testthrows obj = new Testthrows(); 
 obj.p(); 
 System.out.println("normal flow..."); 
 } 
}