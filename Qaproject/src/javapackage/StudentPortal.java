package javapackage;

public class StudentPortal extends UniversityPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentPortal obj= new StudentPortal();
		obj.loginDetails();
	}

	@Override
	void loginDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter your username ");
		System.out.println("Enter your password ");
	}

}


abstract class UniversityPortal
{
	abstract void loginDetails();
	
	protected void profile()
	{
		System.out.println("the name of the university is Haravd");
		System.out.println("The branch is IT");
	}

}