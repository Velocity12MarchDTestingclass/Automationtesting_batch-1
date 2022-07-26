package inheritancewithconstructor;

public class demo_super1 
{
	public demo_super1() //constructor without parameters
	{
		System.out.println("Super class constructor without parameters get called");
	}

	public demo_super1(int a)  //constructor with parameters
	{
		this();
		System.out.println("Super class constructor with parameters get called with value: "+a);
	}
	public demo_super1(float a)  //constructor with parameters
	{
		this();
		System.out.println("Super class constructor with parameters get called with value: "+a);
	}
	public demo_super1(int a,int b)  //constructor with parameters
	{
		this(20);
		System.out.println("Super class constructor with parameters get called with value: "+a+" "+b);
	}
}
