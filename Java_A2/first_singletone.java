/////////First Question////////////

class Student
{
	static Student st=new Student();
	private Student()
	{
		System.out.println("This is a SingleTone Class");
	}
	static Student getInstance()
	{
		return st;
	}
}


public class first_singletone 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s1=Student.getInstance();
		Student s2=Student.getInstance();
	}

}
