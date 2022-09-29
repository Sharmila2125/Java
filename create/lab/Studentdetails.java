class Studentdetails
{
	int sid;
	String sname;
	double marks;
	void input(int x, String y, double z)
	{
		sid=x;
		sname=y;
		marks=z;
	}
	void output()
	{
				System.out.println(sid+"  "+sname+"  "+marks);
	}
}
public class Student
{
    public static void main(String[] args)
	{
       Student s=new Student();
       s.input(10,"Sharmi",65.5);
       s.output();
	}
}