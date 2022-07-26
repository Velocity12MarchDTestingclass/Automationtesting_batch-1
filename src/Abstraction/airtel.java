package Abstraction;

//concrete class
public class airtel extends simcard  
{
	void sms()
	{
		System.out.println("SMS=100sms per day");
	}	
	void calling()
	{
		System.out.println("Calling=unlimited");
	}
	void internet()
	{
		System.out.println("Internet= 2GB per day");
	}
	void callertune()	
	{
		System.out.println("Airtel caller tune");
	}

}
