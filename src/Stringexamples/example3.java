package Stringexamples;

public class example3
{
	public static void main(String[] args) 
	{
		String s1="abc";
		
		String s2= new String("xyz");
		
		String s3="xyz";
		
		String s4="xyz";
		
		String s5=new String("xyz");
		
		s3=s1.concat("pqr");
		
		s3=s3.concat("nhr");
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);		
	}
}
