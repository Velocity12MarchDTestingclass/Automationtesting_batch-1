package typesofvariable;

public class example3 
{
	int e=10;		//non static variable
	
	public static void m1() 
	{
		//used non static variable in static method
		example3 obj= new example3();//created object
		obj.e=20;
		System.out.println(obj.e); // objectname.variablename  20
	}
	public void m2()
	{
		//used non static variable in non static method
		System.out.println(e);
	}
	public void m3()
	{
		
	}
	public static void main(String[] args) 
	{
		m1();
		example3 obj1= new example3();
		obj1.m2();
		obj1.m3();
		obj1.e=30;
		System.out.println(obj1.e);	
		
		example3 obj2= new example3();
		obj2.e=50;
		System.out.println(obj2.e);//50
		obj2.m2();
	}

}
