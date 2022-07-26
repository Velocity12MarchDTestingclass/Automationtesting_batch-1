package accessspecifier;

public class usingmethod 
{
	private void m1()
	{
		System.out.println("Private method called");
	}
	public void m2()
	{
		System.out.println("public method get called");
	}
	protected void m3()
	{
		System.out.println("protected method get called");
	}
	void m4()
	{
		System.out.println("default method get called");
	}
	public static void main(String[] args) 
	{
		usingmethod obj= new usingmethod();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

}
