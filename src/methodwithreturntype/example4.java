package methodwithreturntype;

public class example4 
{
	//method with returntype and with arguments
	public int compare(int a, int b)//local variables
	{
		System.out.println("value of a : "+a);//10
		System.out.println("value of b : "+b);//20
		if(a>b)//10>20 false
			return a;
		else
			return b;//20
	}
	public static void main(String[] args) 
	{
		example4 obj=new example4();
		int result=obj.compare(10, 20);//20
		System.out.println("Largest no. is : "+result);
	}
}
