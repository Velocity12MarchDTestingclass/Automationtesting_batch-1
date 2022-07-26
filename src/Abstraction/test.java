package Abstraction;

public class test {

	public static void main(String[] args) 
	{
		airtel a=new airtel();
		a.sms();
		a.calling();
		a.callertune();
		a.internet();
		System.out.println("********************************");
		jio j= new jio();
		j.callertune();
		j.calling();
		j.sms();
		j.internet();
		System.out.println("********************************");
		idea i=new idea();
		i.sms();
		i.calling();
		i.callertune();
		i.internet();

	}

}
