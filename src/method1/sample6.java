package method1;

public class sample6 
{
	//non static method with parameters
	public void add(int x,int y,int z)// add(int,int,int)
	{
		System.out.println(x+y+z);
		System.out.println(x*y*z);
		System.out.println(x+y);
	}
	public void mult(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		sample6 s1= new sample6();
		s1.add(10,20,30);
		s1.mult(50, 25);
	}

}
