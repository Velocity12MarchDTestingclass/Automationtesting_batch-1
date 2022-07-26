package jumpstatements;

public class continue_example2 {

	public static void main(String[] args) 
	{
		// 1 to 10
		int a=0;
		while(a<10)//5<=10
		{
			a++;// 10	
			if(a==5)// 11==5
				continue;
			System.out.println(a);//1 2 3 4 6 7 8 9 10 
				
		}
		System.out.println("Loop execution completed");
		

	}

}
