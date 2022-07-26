package jumpstatements;

public class continue_example1 {

	//print number from 1 to 5  and skip for 3
	public static void main(String[] args) 
	{
		// 1  6<=5		6
		for(int i=1;i<=5;i++)
		{
			if(i==3)//5==3
			{
				continue;
			}
			System.out.println(i);//1 2 4 5
		}
		System.out.println("Loop completed");		
	}

}
