package Inheritancedemo;

public class son extends father
{
	public void bullet()
	{
		System.out.println("bullet");
	}
	public static void main(String[] args) 
	{
		son s= new son();
		money();//methods from father class
		s.home();//methods from father class
		s.bullet();
	}
}
