package constructor;

public class example2 
{

	int num1;
	int num2;
	//User defined constructor without parameters
	example2()
	{
		num1=20;
		num2=30;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public static void main(String[] args) 
	{
		example2 obj=new example2();
		obj.add();
		
		example3 obj1=new example3();
		obj1.div();
		obj1.mult();
		obj1.sub();
	}
}
