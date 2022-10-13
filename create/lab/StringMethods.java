//Prepare program using String manipulation methods 
  // a)==   b)equals()   c)concat()   d)replace()   e)split() 
//f)charAt    g)compareTo()    h)substring()

import java.lang.String;
public class StringMethods 
{
        public static void main(String[] args) 
        {
            String str1 = "Software";
        String str2 = "Testing";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));//concat method
        String str = "Sharmi";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));//charAt method
         String str = "Sharmi";
        String replace = str.replace('a', 'e');
        System.out.println(str);
        System.out.println(replace);//replace method
        String str = "Sharmi";
        System.out.println(str.substring(8,12));
        System.out.println(str.substring(15,19));// substring
          String str1 = "Software";
        String str2 = "Testing";
        String str3 = "korea";
        String str4 = "India";
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str4));//compare to method
            String s1 = "HI"; 
        String s2 = "HI"; 
        String s3 =  new String("HI"); 
        System.out.println(s1 == s2); 
        System.out.println(s1 == s3); //doule equal mehod
        System.out.println(s1.equals(s2));  
        System.out.println(s1.equals(s3));// equal method
        }
}        