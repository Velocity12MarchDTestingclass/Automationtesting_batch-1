package logicalprogram;

public class string_reverse 
{
	//Java program to reverse string
	public static void main(String[] args) 
	{
		String s1="Velocity";//yticoleV
		String s2="";
			// i=7 6 5 4 3 2 1 0 -1
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);//s2=""+y=y+t=yt+i=yti+c=ytic+o=ytico+l=yticol+e
								// yticole+V=yticoleV
		}
		System.out.println("Original String: "+s1);
		System.out.println("Reverse String: "+s2);
	}

}
