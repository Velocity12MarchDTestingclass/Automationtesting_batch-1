package methods;

public class Sample1 
{
	//method declaration
	public void display()//non static method
	{
		System.out.println("non static method get called");
	}
	
	
	public static void main(String[] args) 
	{
		//object creation
		//classname objectname= new classname();
		
		Sample1 s1 = new Sample1();
		//objectname.methodname();
		
		s1.display();//method call
		
		sample2 obj= new sample2();
		
		obj.show();	
	}
}
