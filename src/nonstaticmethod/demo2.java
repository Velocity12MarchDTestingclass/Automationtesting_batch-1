package nonstaticmethod;

public class demo2 
{
	public static void main(String[] args) 
	{
		//step2: object creation
		demo d= new demo();
		
		//step3:method call
		d.square(25);
		d.rectangle(20, 30);
		d.circle(10);
		demo3.show();
		demo5 d1= new demo5();
		d1.message();
	}

}
