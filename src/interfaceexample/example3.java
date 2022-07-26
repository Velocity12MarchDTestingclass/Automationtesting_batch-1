package interfaceexample;

public class example3 implements example1,example2
{
	public void m1()
	{
		System.out.println("Method m1 is called from example1 interface");
	}
	public void m2()
	{
		System.out.println("Method m2 is called from example1 interface");
	}
	public void m3()
	{
		System.out.println("Method m3 is called from example2 interface");
	}
	public void m4()
	{
		System.out.println("Method m4 is called from example2 interface");
	}
	public static void main(String[] args) 
	{
		example3 obj= new example3();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

}
