package nonstaticmethod;

public class demo3 
{
	//calling non static method in static method
	
	public static void show()//static method
	{
		demo d1=new demo();
		d1.square(30);
	}
}
