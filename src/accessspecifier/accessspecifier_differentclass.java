package accessspecifier;

public class accessspecifier_differentclass 
{
	public void m2()
	{
		access_specifier1 obj=new access_specifier1();
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
	public static void main(String[] args) 
	{
		accessspecifier_differentclass obj1= new accessspecifier_differentclass();
		obj1.m2();
	}
}
