package typesofvariable;

public class local_example1 
{
	public void m1()
	{
		int v1=10;	//Local variable
		System.out.println(v1);
	}
	public static void m2()
	{
		local_example1 l1=new local_example1();
		l1.m1();
		int v1=10;
		System.out.println(v1);
		
	}
	public static void main(String[] args) 
	{
		int v1=100;
		local_example1 l1=new local_example1();
		l1.m1();
		m2();
		System.out.println(v1);
		
	}

}
