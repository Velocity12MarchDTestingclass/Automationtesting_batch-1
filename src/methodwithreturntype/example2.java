package methodwithreturntype;

public class example2 
{
	//create method which return String value
	
	public String m1()
	{
		String str="M1 method is called";
		//System.out.println(str);
		return str;
	}
	public void m2()
	{
		System.out.println("Without return type "+m1());//M1 method is called
		
	}
	public static void main(String[] args) 
	{
		example2 obj=new example2();
		//System.out.println(obj.m1());//M1 method is called
		obj.m2();
	}
}
