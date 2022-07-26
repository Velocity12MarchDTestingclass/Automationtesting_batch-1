package constructor;

public class example7 
{
	//example for multiple constructor
	int length;
	int breadth;
	int radius;
	int side;
	//first constructor without parameters
	example7()
	{
		System.out.println("Calculating area of Rectangle");	
	}
	//second is parameterized constructor
	example7(int a,int b)//example7(int,int)
	{
		length=a;
		breadth=b;
	}
	example7(int r)
	{
		radius=r;
		side=r;	
	}
	public void areas()
	{
		System.out.println("Area of square: "+(side*side));
	}
	public void areac()
	{
		System.out.println("Area of circle: "+(3.14*radius*radius));
		
	}
	public void area()
	{
		int area=length*breadth;
		System.out.println("Area of rectangle= "+area);
	}
	
	public static void main(String[] args) 
	{
		example7 obj= new  example7();

		example7 obj1=new example7(10,20);
		obj1.area();
		
		example7 obj2=new example7(20);
		obj2.areas();
		
		example7 obj3=new example7(5);
		obj3.areac();
	}
}
