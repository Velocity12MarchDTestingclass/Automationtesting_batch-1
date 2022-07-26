package inheritancewithconstructor;

public class demo_sub2 extends demo_super1
{
	public demo_sub2()
	{
		super(30); //constructor chaining 
		System.out.println("sub class constructor get called");
	}
	public demo_sub2(int x)
	{
		super(20); //constructor call should be first statement
		System.out.println("sub class constructor with parameters get called: "+x);
	}
	public demo_sub2(int x,int y,int z)
	{
	
		super(20,30); //constructor call should be first statement
		System.out.println("sub class constructor with parameters get called: "+x+" "+y+" "+z);
	}
	
	public static void main(String[] args) 
	{
		demo_sub2 d=new demo_sub2(10);	
	}

}
