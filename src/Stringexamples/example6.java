package Stringexamples;

public class example6 {

	public static void main(String[] args) 
	{
		String s1="hgedh82gdiduho 92039 hd 880 3 29hiwjho7298yn";
		//replace():
		
		String s2=s1.replace("h", "z");
		System.out.println(s2);
		
		//replaceFirst():
		
		System.out.println(s1.replaceFirst("h", "z"));
		
		//replaceAll():
		//Java program to print only numbers from given String
		
		String result=s1.replaceAll("[^0-9]","");
		System.out.println(result);
		
		
	}

}
