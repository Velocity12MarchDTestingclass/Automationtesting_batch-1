package constructor;

public class example4 
{
	//parameterized constructor
	
	int num1;	//global variables
	int num2;	//global variables
	
	example4(int a, int b)//local variables
	{
		num1=a;//50
		num2=b;//5
	}
	public void div() 
	{
		int division=num1/num2;//50/5=10
		System.out.println(division);//10
	}
	
	public static void main(String[] args) 
	{
		example4 ex4=new example4(50,5);
		ex4.div();

		example5 ex5=new example5(60,13);
		ex5.add();
		ex5.sub();
		ex5.mult();
		ex5.mod();
	}

}
