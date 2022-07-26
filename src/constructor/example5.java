package constructor;

public class example5 
{
	int num2;
	int num3;
	
	example5(int a, int b)
	{
		num2=a;
		num3=b;
	}
	
	public void add()
	{
		System.out.println(num2+num3);
	}
	public void sub()
	{
		System.out.println(num2-num3);
	}
	public void mult()
	{
		System.out.println(num2*num3);
	}
	public void mod()
	{
		System.out.println(num2%num3);
	}

}
