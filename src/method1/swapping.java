package method1;

public class swapping 
{
	//swap the values of two numbers without using third variable
	public void swap(int num1,int num2)
	//num1=30 70 40      num2=40  30
	{
		System.out.println("Before swapping values are num1= "+num1+" & num2= "+num2);
		num1=num1+num2;//num1=30+40=70
		num2=num1-num2;//num2=70-40=30
		num1=num1-num2;//num1=70-30=40
		System.out.println("After swapping values are num1= "+num1+" & num2= "+num2);
		
	}
	public static void main(String[] args) 
	{
		swapping obj=new swapping();
		obj.swap(30, 40);
	}	
}
