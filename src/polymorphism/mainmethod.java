package polymorphism;

public class mainmethod 
{
    public static void main()
    {
    	System.out.println("main method without arguments");
    }
    public static void main(int a)
    {
    	System.out.println(a);
    }
	public static void main(String[] args) 
	{
		main();
		main(30);
	}

}
