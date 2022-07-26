package exceptionhandling;

public class example4 
{
	//try_catch_finally block
	public static void main(String[] args) 
	{
		int [] ar= {45,34,23,56,6,7,98};
		try
		{
			ar[7]=20;//ArrayIndexOutofBoundsException
		}
		catch(Exception e)
		{
			System.out.println("Can't add value in array at runtime");
		}
		finally
		{
			System.out.println("logout from application");
		}
		System.out.println("Hello");
	}
}
