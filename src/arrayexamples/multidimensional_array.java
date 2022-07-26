package arrayexamples;

public class multidimensional_array {

	public static void main(String[] args) 
	{
		//Step1: Array declaration
		int [][] arr= new int[2][3];// row index= 0 1   column index= 0 1 2
		
		//Step2: Array Initialization
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println(arr.length);
		
		//Step3: Array usage
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		//using for loop
			// i= 2
		for(int i=0;i<=1;i++)//outer for loop for rows
		{		// j=3
			for(int j=0;j<=2;j++)//inner for loop for columns
			{					//	arr[1][2]
				System.out.print(arr[i][j]+" ");//10 20 30 40 50 60
			}
		}
	}
}
