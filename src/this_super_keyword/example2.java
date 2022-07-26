package this_super_keyword;

public class example2 extends super1
{
	int x=40;
	public example2()
	{
		super();
		System.out.println("sub class get called");
	}
	public void display()
	{
		System.out.println(x);//40
		System.out.println(super.x);
	}
	
	public static void main(String[] args) 
	{
		example2 obj=new example2();
		obj.display();
	}
}
