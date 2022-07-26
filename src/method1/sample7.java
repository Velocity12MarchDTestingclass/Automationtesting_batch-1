package method1;

public class sample7 
{
	//Calling non static method in another non static method
	public void m1(String s)//non static method
	{
		System.out.println(s);
	}
	public void show()//non static method
	{
		m1("Good morning, calling in another nonstatic method");
	}
	public static void main(String[] args) 
	{
		sample7 s2= new sample7();
		s2.show();
		s2.m1("welcome");
	}
}
