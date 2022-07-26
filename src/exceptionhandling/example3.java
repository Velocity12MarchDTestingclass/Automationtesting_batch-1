package exceptionhandling;

public class example3 
{
	//try_catch block for handling exception
	public static void main(String[] args) 
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try
		{
			System.out.println(50/0);//risky code
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You can not divide any number by zero");
		}	
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	}
}
