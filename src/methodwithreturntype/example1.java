package methodwithreturntype;

public class example1 
{
	// method with return type
	// create method that should return integer value
	
	public int m1()
	{
		return 20;
	}
	
	public static void main(String[] args) 
	{
		example1 ex1=new example1();
		int a=ex1.m1();//20
		System.out.println(a);//20
		
		System.out.println(ex1.m1());//20

	}

}
