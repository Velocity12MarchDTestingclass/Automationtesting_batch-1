package logicalprogram;

public class palindrome_string 
{
	//Java program to check the given string is Palindrome string madam=madam pop=pop
	public static void main(String[] args) 
	{
		String str="Madam";
		String rev="";
		for(int j=str.length()-1;j>=0;j--)
		{
			rev=rev+str.charAt(j);
		}
		System.out.println("Original String: "+str);
		System.out.println("Reversed String: "+rev);//madaM
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str+" is palindrome string");
		}
		else
		{
			System.out.println(str+" is not palindrome string");
		}
	}
}
