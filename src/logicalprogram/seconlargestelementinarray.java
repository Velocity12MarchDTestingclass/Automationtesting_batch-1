package logicalprogram;

import java.util.Arrays;

public class seconlargestelementinarray 
{
	//Java program to find second largest element in Array 80
	public static void main(String[] args) 
	{
		int [] arr= {50,40,90,80,56,32,21,78,53,45};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		int secondlarge= arr[arr.length-2];
		System.out.println();
		System.out.println("Second largest no : "+secondlarge);
	}

}
