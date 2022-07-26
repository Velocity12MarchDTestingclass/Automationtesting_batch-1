 
 package jumpstatements;

public class break_example1 {

	//print number from 1 to 5 but the range I got is from 1 to 20
	public static void main(String[] args) 
	{
		//1   5<=20 5
		for(int i=1;i<=20;i++)
		{
			System.out.println(i); // 1 2 3 4 5
			if(i==5)//5==5
				break;
		}
		System.out.println("Loop stopped");
	}
}
