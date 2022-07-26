package method1;

public class sample8 
{
	// calling non static method in another static method
	public void display()
	{
		System.out.println("hello");
		message();	
	}
	public static void message()
	{
		sample8 obj=new sample8();
		obj.display();
	}
	public static void main(String[] args) 
	{
		message();
	}
}
