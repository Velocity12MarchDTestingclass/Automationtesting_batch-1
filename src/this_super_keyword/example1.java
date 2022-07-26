package this_super_keyword;

public class example1 
{
	int a=20; //global variable
	public example1()
	{
		System.out.println(" Super class constructor get called");
	}
	public example1(String str)
	{
		this();
		System.out.println(str);
	}
	public void display()
	{
		int a=30;  //local variable
		System.out.println(a);//30
		System.out.println(this.a);
	}
}
