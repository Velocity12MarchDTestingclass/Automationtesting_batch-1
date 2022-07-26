package operators;

public class Logicaloperator {

	public static void main(String[] args) 
	{
		int c=5,d=3,e=8;
		
		//&& operator
		System.out.println((c>d)&&(e>c));
		//5>3 && 8>5   true && true   true
		System.out.println((d>c)&&(e>d));
		//3>5 && 8>3   false && true  false
		System.out.println((d>c)&&(d>e));
		//3>5 && 3>8   false && false  false
		
		//|| operator
		System.out.println((c>d)||(e>c));
		//5>3 || 8>5  true||true   true
		System.out.println((d>c)||(e>d));
		//3>5||8>3  false || true  true
		
		
		//!operator
		System.out.println(!(c>d));//!(5>3)	!true  false
		System.out.println(!(d>c));//!(3>5)	!false	true

	}

}
