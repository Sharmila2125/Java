//To make inheritance for given below classes



class Person {
	public void print_A() { 
	    int pid=5;
	    String name="sharmila";
	    System.out.println(pid  +" "+ name); }
}

class  Student extends person {
	public void print_B() { 
	    int marks=45;
	    System.out.println(marks);
	    }
}

class   Emp extends person {
	public void print_C() { 
	    double salary =3500;
	    System.out.println(salary); 
	    
	}
}

class test {

// Driver Class

	public static void main(String[] args)
	{
	  Student obj_B = new  Student();
		obj_B.print_A();
		obj_B.print_B();

		Emp obj_C = new Emp();
		obj_C.print_A();
		obj_C.print_C();

	
	}
}