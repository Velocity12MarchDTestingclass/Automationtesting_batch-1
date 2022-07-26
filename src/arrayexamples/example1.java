package arrayexamples;

public class example1 
{
	//create array of int datatype
	public static void main(String[] args) 
	{
		//Step1: Array declaration
		
		int [] arr = new int[5];
		
		//Step2: Array initialization
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
	
		
		//Step3: Array usage
		
		System.out.println(arr[0]);//10
		System.out.println(arr[1]);//20
		System.out.println(arr[2]);//30
		System.out.println(arr[3]);//40
		System.out.println(arr[4]);//50
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
	}

}
