package method1;

public class sample9 
{
	//Calling static method in non static method
	public static void display()//static method
	{
		System.out.println("Calling from non static method");
	}
	public void m1()//non static method
	{
		display();//called static method in non static method
	}
	public static void main(String[] args) 
	{
		sample9 obj= new sample9();
		obj.m1();// called non static method in main method
	}

}
