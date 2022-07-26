package methods;

public class swapping 
{
	//Swapping values of two numbers using third variable
	// num1=10 num2=20  swap num1=20 num2=10
	
	public static void swap(int a, int b)// 30  50  swap(int,int)
	{
		int temp;
		temp=a;//temp=30  a=30  b=50
		a=b; // a=50 b=50 temp=30
		b=temp;// b=30 a=50 temp=30
		System.out.println("After swaping values are number1 "+a+"number2 "+b);		
	}
	public static void main(String[] args) 
	{
		swap(30,50);
	}
}
