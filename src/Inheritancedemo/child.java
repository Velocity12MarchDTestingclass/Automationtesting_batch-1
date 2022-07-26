package Inheritancedemo;

public class child extends parent 
{
	//Properties of parent class
//	public void money()
//	{
//		System.out.println("Money");
//	}
//	public void home()
//	{
//		System.out.println("Home");
//	}
//	public void vehicle()
//	{
//		System.out.println("car");
//	}
	public void money()
	{
		System.out.println("Money from child");
	}
	public void mobile()
	{
		System.out.println("Realme");
	}	
	public static void main(String[] args) {
		child c=new child();
		c.money();
	}
}
