package operators;

public class Relationaloperator {

	public static void main(String[] args) 
	{
		int a=10, b=20;
		System.out.println("Value of a is " + a + "    Value of b is "+b);
		//==operator
		System.out.println("The condition is "+(a==b));//10==20  false
		//!=operator
		System.out.println("The condition is "+(a!=b));//10!=20  true
		//>operator
		System.out.println("The condition is "+(a>b));//10>20    false
		//<operator
		System.out.println("The condition is "+(a<b));//10<20    true
		//>=operator
		System.out.println("The condition is "+(a>=b));//10>20or10==20   false 
		//<=operator
		System.out.println("The condition is "+(a<=b));//10<20or10==20  true or false  true
		
        // a<b or a==b    false or true  true
	}

}
