package methodwithreturntype;

public class example3 
{
	//method1 return float value
	public float m1()
	{
		float a=30.5f;
		return a;
	}
	//method2 return char value
	public char m2()
	{
		char grade='A';
		return grade;
	}
	//method3 return boolean value
	public boolean m3()
	{
		boolean b=true;
		return b;	
	}
	public static void main(String[] args) 
	{
		example3 obj=new example3();
		float f=obj.m1();
		char c=obj.m2();
		boolean d=obj.m3();
		System.out.println(f);
		System.out.println(c);
		System.out.println(d);

	}

}
