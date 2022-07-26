package constructor;

public class example6 
{
	//global variables
	int rollno;
	String name;
	String address;
	String collegename;
	float percentage;
	char grade;
	
	//parameterized constructor
	example6(int a,String b, String c, String d, float f, char g)//local variables
	{
		rollno=a;
		name=b;
		address=c;
		collegename=d;
		percentage=f;
		grade=g;	
	}
	
	public void infodisplay()
	{
		System.out.println("Student Information");
		System.out.println("Roll no= "+rollno);
		System.out.println("Name= "+name);
		System.out.println("Address= "+address);
		System.out.println("college name= "+collegename);
		System.out.println("percentage= "+percentage);
		System.out.println("Grade = "+grade);
	}
	public static void main(String[] args) 
	{
		example6 ex6=new example6(1,"Neha","Pune","MIT",60.5f,'A');
		ex6.infodisplay();
		example6 ex7=new example6(2,"Sachin","Mumbai","DYP",70.5f,'A');
		ex7.infodisplay();
		example6 ex8=new example6(3,"Suraj","Mumbai","DYP",50.5f,'B');
		ex8.infodisplay();
		

	}

}
