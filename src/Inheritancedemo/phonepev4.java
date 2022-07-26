package Inheritancedemo;

public class phonepev4 extends phonepev3
{
	public void ticketbooking()
	{
		System.out.println("Feature ticket book in version 4");
	}
	public static void main(String[] args) 
	{
		phonepev4 v4=new phonepev4();
		v4.moneytransfer();
		v4.loanpayment();
		v4.recharge();
		v4.ticketbooking();

	}

}
