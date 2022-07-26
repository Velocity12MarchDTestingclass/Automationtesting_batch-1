package methods;

public class example1 
{
	//method declare
	public static void display()
	{
		System.out.println("Welcome");
	}
	public static void show()
	{
		System.out.println(" Static method is executing");
		display();
	}
	public static void main(String[] args) 
	{		
			example2.message();//method call from different class
			
	}
}
