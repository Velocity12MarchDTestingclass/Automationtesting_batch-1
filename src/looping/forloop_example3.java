package looping;

public class forloop_example3 {
	//Program to print even numbers from 1 to 100
	//starting point  1
	//end point       100
	//increment operator
	public static void main(String[] args) 
	{
		// 1      101<=100	101 //false
		for(int i=1;i<=100;i++)
		{
			// 100%2==0  true
			if(i%2==0)
			{
				System.out.println(i+" is even number");//2 4 ... 100
			}
		}	
	}

}
