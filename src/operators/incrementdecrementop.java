package operators;

public class incrementdecrementop {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
				
		//Postincrement and Postdecrement
		System.out.println("Used increment operator "+(a++));//a+1  Postincrement
		System.out.println("Used increment operator "+a);
		
		System.out.println("Using Decrement operator "+(b--));//postdecrement b-1
		System.out.println(b);
		
		System.out.println(b--);//19=>19-1=18
		System.out.println(b);
		
		//Preincrement and Predecrement  operator operand
		//a=10  b=20
		System.out.println("******************");
		System.out.println("Using increment operator "+(++a));//a+1 
		System.out.println(a);
		
		System.out.println("using decrement operator " + (--b));//b-1 18-1=17
		System.out.println(b);	
	}

}
