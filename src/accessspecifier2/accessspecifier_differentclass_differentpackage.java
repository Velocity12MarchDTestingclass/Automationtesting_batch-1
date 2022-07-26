package accessspecifier2;

import accessspecifier.access_specifier1;

public class accessspecifier_differentclass_differentpackage extends access_specifier1 
{
	public void m3()
	{
//		access_specifier1 obj=new access_specifier1();	
//		System.out.println(obj.d);
		System.out.println(b);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		accessspecifier_differentclass_differentpackage obj1=new accessspecifier_differentclass_differentpackage();
		obj1.m3();
	}

}
