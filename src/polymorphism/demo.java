package polymorphism;

public class demo 
{
	//Creating method add() with different set of arguments

	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println("Addition: "+c);
	}
	
	public void add(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("Addition of three numbers: "+d);
	}
	public void add(String name,String address)
	{
		System.out.println(name);
		System.out.println(address);
	}
	public static void main(String[] args) 
	{
		demo obj= new demo();
		
		obj.add(50, 60);
		obj.add(40,50,70);
		obj.add("Neha", "Pune");
	}

}
