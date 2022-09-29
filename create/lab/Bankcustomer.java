public class Bankcustomer
{
    
	int accno;
	String acctype;
	double amountfields;

     	Bankcustomer()
	{
		accno=1;
		acctype="xyz";
		amountfields=4000;
	}
	  Bankcustomer(int x)
	{
		accno=x;
	}
     	Bankcustomer(int x,String y)
	{
		accno=x;
		acctype=y;
	}
	
	 Bankcustomer(int x,String y,double z)
	{
		accno=x;
		acctype=y;
		amountfields=z;
	}
	void show()
	{
		System.out.println(accno+" "+acctype+" "+amountfields);
	}
	public static void main(String[]  args){
	{
		Bankcustomer b1=new Bankcustomer();
		Bankcustomer b2=new Bankcustomer(3,"sharmi");
		Bankcustomer b3=new Bankcustomer(2,"vichi",123);
		b1.show();
		b2.show();
		b3.show();

	}
}
}