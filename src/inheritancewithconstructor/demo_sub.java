package inheritancewithconstructor;

public class demo_sub extends demo 
{
	//user defined constructor is present in parent but not in child class
	public static void main(String[] args) 
	{
		demo_sub d= new demo_sub();
		//first call is to the parent class constructor
		//second call goes to child class constructor	
	}
}
