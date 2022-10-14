//wrp to perform StringBuilder class method:

public  class StringBuilder
{
	public static void main(String[] args)
	{

	StringBuilder s1=new StringBuilder("sharmi");
	StringBuilder s2=new StringBuilder("neela");
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