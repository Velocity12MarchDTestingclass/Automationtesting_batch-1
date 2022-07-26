package polymorphism;

public class example1 
{
	public void m1()     //method declaration->stored in heap area
	{
		System.out.println("non static method");// method definition-> stored in method area
	}
	public void m1(int a)
	{
		System.out.println(a);	
	}
	public void m1(int a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
	example1 obj=new example1();
	obj.m1(); //binding of method declaration and definition
	obj.m1(10);
	obj.m1(20, "Velocity");
	}

}
