package typesofvariable;

public class example4 
{
	int rollno;
	int maths;
	int eng;
	int sci;
	static String school="Highschool";

	public static void main(String[] args) 
	{
		example4 Priya =new example4();
		example4 Rahul =new example4();
		example4 Kirti =new example4();
		
		school="College";
		
		Priya.rollno=1;
		Priya.maths=70;
		Priya.eng=80;
		Priya.sci=60;
		
		Rahul.rollno=2;
		Rahul.maths=80;
		Rahul.eng=67;
		Rahul.sci=75;
		
		Kirti.rollno=3;
		Kirti.maths=60;
		Kirti.eng=75;
		Kirti.sci=80;
		
		System.out.println("Priya got marks for Mathematics, English, Science : "+Priya.rollno+"  "+Priya.maths+"  "+Priya.eng+"  "+Priya.sci+" "+school);
		System.out.println("Rahul got marks for Mathematics, English, Science : "+Rahul.rollno+"  "+Rahul.maths+"  "+Rahul.eng+"  "+Rahul.sci+" "+school);
		System.out.println("Kirti got marks for Mathematics, English, Science : "+Kirti.rollno+"  "+Kirti.maths+"  "+Kirti.eng+"  "+Kirti.sci+" "+school);
		

	}

}
