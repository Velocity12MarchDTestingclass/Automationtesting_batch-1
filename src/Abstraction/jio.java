package Abstraction;

//concrete class
public class jio extends simcard
{
	void sms()
	{
		System.out.println("SMS=200sms per day");
	}	
	void calling()
	{
		System.out.println("Calling=unlimited");
	}
	void internet()
	{
		System.out.println("Internet= 3GB per day");
	}
	void callertune()	
	{
		System.out.println("Jio caller tune");
	}
}
