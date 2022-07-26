package casting;

public class implicit_explicit_casting 
{
	static int a=20;
	static double b=30.7;
	public static void main(String[] args) 
	{
		//implicit casting
		double sum=a+b;// 20.0+30.7
		System.out.println(sum);
		
		//explicit casting
		int add=a+(int)b; //20+30 50
		System.out.println(add);		
	}
}
