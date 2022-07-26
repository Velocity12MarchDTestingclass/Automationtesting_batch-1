package methodwithreturntype;

public class example6 
{
	//program to return square and cube of number of integer value
	
	public int square(int num)
	{
		return num*num;//3*3=9
	}
	public int cube(int num)
	{
		return num*num*num;//9*9*9
	}
	
	public static void main(String[] args) 
	{
		example6 obj=new example6();
		int a=obj.square(3);//9
		int b=obj.cube(a);//obj.cube(9)
		System.out.println("square: "+a+" cube : "+b);

	}

}
