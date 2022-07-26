package polymorphism;

public class subclass extends superclass
{
	public void add(int c, int d)  //add(int,int)
	{
		super.add(30, 50);
		System.out.println("Multiplication: "+(c*d));
	}
	public static void main(String[] args) 
	{
		subclass sub= new subclass();
		sub.add(30, 20); 
	}
}



