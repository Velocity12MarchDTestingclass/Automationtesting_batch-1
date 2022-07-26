package polymorphism;

public class subclass1 extends superclass1 {

	public static void add(int c, int d)  //add(int,int)
	{
		//super.add(30, 50);
		System.out.println("Multiplication: "+(c*d));
	}
	public void m1(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		//static method overriding is not possible 
		add(20,30);
		superclass1.add(30, 40);
		
		//method overloading in inherited class is possible
		subclass1 s= new subclass1();
		s.m1();
		s.m1(30);
	}

}
