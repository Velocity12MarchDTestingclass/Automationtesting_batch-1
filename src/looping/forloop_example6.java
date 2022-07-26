package looping;

public class forloop_example6 {

	// program to print even and odd numbers from 50 to 10
	//starting point 50
	//end point      10
	//decrement operator
	public static void main(String[] args) 
	{
		//50        9>=10	9
		for(int i=50;i>=10;i--)
		{
			//10%2==0 true
			if(i%2==0)
			{
				System.out.println(i+" is even number");//50 48 ...  10
			}
			else
			{
				System.out.println(i+" is odd number");//49
			}
		}
	}

}
