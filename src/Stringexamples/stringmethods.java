package Stringexamples;

public class stringmethods {

	public static void main(String[] args) 
	{
		//length():  size of string
		String s1="Welcome to Testing";
		System.out.println(s1.length());
		
		//equals(): check the equality of two string case and content
		String s2="Velocity";
		String s3="velocity";
		String s4="Velocity";
		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equals(s4));//true
		System.out.println(s3.equals(s4));//false
		
		//equalsIgnoreCase()
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//charAt(index):
		
		String s5="Software Testing";
		System.out.println(s5.length());
		System.out.println(s5.charAt(8));
		
		//toUppercase() and toLowercase()
		String s6=" Velocity 12 March Batch";
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());

		//concat()
		System.out.println(s5.concat(s6));
		
		
	}

}
