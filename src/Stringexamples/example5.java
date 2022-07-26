package Stringexamples;

public class example5 {

	public static void main(String[] args) 
	{
		//trim()
		String str=" Welcome to String class ";
		System.out.println(str);
		System.out.println(str.trim());//Welcome to String class
		
		//contains():
		String str1=" Good Evening! Welcome to today's class we are going to study String methods";
		System.out.println(str1.contains("Good Evening!"));//true
		
		//startsWith()
		System.out.println(str1.startsWith(" Good Evening!"));
		System.out.println(str1.startsWith("Welcome"));
		
		//endsWith()
		System.out.println(str1.endsWith("String methods"));
		System.out.println(str1.endsWith("String methods "));
		
		//isEmpty()
		
		String str2="";
		String str3=" ";
		String str4="Velocity";
		
		System.out.println(str2.isEmpty());//true
		System.out.println(str3.isEmpty());//false
		System.out.println(str4.isEmpty());//false
		
		//indexOf()
		
		String str5="Sachin, Suresh, Priya, Riya, Suresh";
		
		System.out.println(str5.indexOf('i'));//9
		System.out.println(str5.indexOf("Priya"));//16
		
		//lastIndexOf()
		
		System.out.println(str5.lastIndexOf('i'));
		System.out.println(str5.lastIndexOf("Suresh"));
		
		//toCharArray()
		
		char [] arr=str5.toCharArray();
		for(char s:arr)
		{
			System.out.print(s+" ");
		}
		
		//split()
		
		String str6="Sachin, Suresh, Priya, Riya, Suresh";
		
		String [] s=str6.split(" ");//Sachin,
						//Suresh,
						//Priya,
						//Riya,
						//Suresh
		for(String s1:s)
		{
			System.out.println("\n"+s1);
		}
		String [] s2= str6.split("r");//Sachin, Su=0
									  //esh, P=1
									  //iya, Riya, Su=2					 
									  //esh=3
		for(String s4:s2)
		{
			System.out.println("\n"+s4);
		}
		
		//substring()
		String str7=" Good Evening! Welcome to today's class we are going to study String methods";
		String a=str7.substring(15);//Welcome to today's class we are going to study String methods
		System.out.println(a);
		
		String b= str7.substring(15,22);
		System.out.println(b);
	}

}
