package javapackage;

public class EncapsulationCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj= new Student();
		obj.setName("Tadele");
		obj.setId(101);
		obj.setage(30);
		System.out.println(obj.getname());
		System.out.println(obj.getId());
		System.out.println(obj.getAge());
	}

}


class Student
{
	private String name;
	private int id;
	private int age;
	
	void setName(String nam)
	{
		name=nam;
		
	}
	
	void setId(int i)
	{
		id=i;
	}
	
	void setage(int a)
	{
		age=a;
	}
	
	String getname()
	{
		return name;
	}
	int getId()
	{
		return id;
	}
	
	int getAge()
	{
		return age;
	}
}