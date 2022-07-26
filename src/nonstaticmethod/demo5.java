package nonstaticmethod;

public class demo5 
{
	//calling non static method in non static method
	
	public void message()
	{
		demo d= new demo();
		d.square(30);
	}
}
