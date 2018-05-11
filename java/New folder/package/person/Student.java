package person;
public class Student
{
	private int rollno;
	private  String name;
	private String gender;
	private int age;
	public Student(int rollno,String name,String gender,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String getname()
	{
		return name;
	}
	public int getrollno()
	{
		return rollno;
	}
	public int  getage()
	{
		return age;
	}
	public String getgender()
	{
		return gender;
	}
	public void display()
	{
		System.out.println("ROLLNO	:"+rollno+"\nNMAE	:"+name+"\nGENDER	:"+gender+"\nAGE	:"+age+"\n");
	}
        public Student(){}
	
}