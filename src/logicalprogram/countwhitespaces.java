package logicalprogram;

public class countwhitespaces 
{
	//Java program to find total no. of whitespaces in string
	public static void main(String[] args) 
	{
		String str="bquh wkjb cwjo weu324 54 5%9 4gef &%98wjheo 7yrwiui";
		//Method1
		int count=0;
		char [] c=str.toCharArray();
		for(char s:c)
		{
			if(s==' ')
			{
				count++;//2
			}
		}
		System.out.println("No of whitespaces: "+count);//8
		
		//Method2
		String w=str.replaceAll("[a-z0-9%&]","");
		System.out.println(w);
		System.out.println(w.length());

	}

}
