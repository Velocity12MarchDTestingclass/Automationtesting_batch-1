package looping;

public class forloop_example5 
{
	//program to print number from 5 to 1 => 5 4 3 2 1
	//starting point   5
	//end point         1
	//decrement operator
	public static void main(String[] args) 
	{	
		//5         0>=1 0
		for(int a=5;a>=1;a--)
		{
			System.out.println(a);//5 4 3 2 1
		}
		
		//  Program to print in format 5 10 15 20 25 30
		//	5		35<=30  35
		for(int i=5;i<=30;i=i+5)
		{
			System.out.println(i);//5  10 15 .... 30
		}	
	}

}
