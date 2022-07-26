package inheritancewithconstructor;

public class demo_sub1 extends demo 
{
	//user defined constructor is present in parent as well as child class
	public demo_sub1()
	{
		System.out.println("subclass constructor get called");
	}
	public static void main(String[] args) 
	{
		demo_sub1 d=new demo_sub1();

	}

}
