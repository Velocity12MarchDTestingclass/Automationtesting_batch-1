package logicalprogram;

import java.util.Scanner;

public class userinput 
{
	//Taking input from user
	public static void main(String[] args) 
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter your first name:");
		String str=obj.nextLine();
		System.out.println("Enter roll no.: ");
		int a=obj.nextInt();
		System.out.println("First name:"+str+"\nRoll no. "+a);
	}

}
