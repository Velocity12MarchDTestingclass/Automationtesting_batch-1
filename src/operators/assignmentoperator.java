package operators;

public class assignmentoperator 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=10;
		
		//+= operator
		
		System.out.println(a+=b);//a=a+b a=20+10 a=30
		System.out.println(a);//30
		
		//a=30
		//-= operator
		
		System.out.println(a-=b);//a=a-b a=30-10 a=20
		System.out.println(a);
		//a=20
		//*= operator
		System.out.println(a*=b);//a=a*b a=20*10 a=200
		System.out.println(a);	

	}
}
