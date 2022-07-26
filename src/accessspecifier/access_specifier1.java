package accessspecifier;

public class access_specifier1 
{
	private int a=20;
	protected int b=30;
	int c=40;
	public int d=50;
	
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		access_specifier1 obj=new access_specifier1();
		obj.m1();
	}	
}
