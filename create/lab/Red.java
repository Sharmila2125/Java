//inheritance
class Red
{
    void msg()
	{
	 System.out.println("red color");
	}
}
class Green
{
    void msg()
	{
	  System.ou.println("green color");
	}
}
class Yellow extends Red,Green
{
    void msg3()
	{
	    System.out.println("yellow color");
	}
}
public class Inh2
{
public static void main(String[] args)
Yellow y=new Yellow();
y.msg();
}
}
