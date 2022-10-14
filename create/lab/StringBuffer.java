//wrp to perform StringBuffer class method:

public  class StringBuffer
{
	public static void main(String[] args)
	{

	StringBuffer s1=new StringBuffer("sharmi");
	StringBuffer s2=new StringBuffer("neela");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.append(s2));
	System.out.println(s1);
	System.out.println(s1.delete(3,5));
	System.out.println(s1);
	System.out.println(s1.insert(3,"neela"));
	System.out.println(s1);
	System.out.println(s2.reverse());
	System.out.println(s2);
	}
}