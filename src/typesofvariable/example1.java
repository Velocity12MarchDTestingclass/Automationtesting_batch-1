package typesofvariable;

public class example1 
{
	static int s;		//static variable
	
	public void display()
	{
		//used static variable in nonstatic method
		System.out.println(s);//40
		s++;//41
	}
	public static void m1()
	{
		//used static variable in static method
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		System.out.println(s);//40
		example1 e=new example1();
		e.display();//40
		m1();//41
		System.out.println(example2.d);//30
	}

}
