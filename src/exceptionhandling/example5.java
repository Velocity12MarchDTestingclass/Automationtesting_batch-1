package exceptionhandling;

public class example5 
{
	//try_finally block
	public static void main(String[] args) 
	{
		String s="abc";
		try
		{
			System.out.println(s.charAt(3));
		}
		finally
		{
			System.out.println("logout from application");
		}
		System.out.println("hello");
	}
}
