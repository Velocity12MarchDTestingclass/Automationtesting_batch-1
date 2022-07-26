package arrayexamples;

public class string_array 
{
	public static void main(String[] args) 
	{
		//Step1: Array declaration
		
		String [] str= new String[3];// 0 1 2=index
		
		//Step2: Array initialization
		
		str[0]="Suresh";
		str[1]="Pankaj";
		str[2]="Priya";
		
		//Step3: Array usage
		//Using for loop
		for(int i=0;i<=2;i++)
		{
			System.out.print(str[i]+" ");// Suresh Pankaj Priya 
		}
		System.out.println();
		
		// Using foreach loop
		for(String j: str)
		{
			System.out.println(j);
		}
	}
}
