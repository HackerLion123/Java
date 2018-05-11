
Script started on Fri 04 Aug 2017 10:59:25 AM IST
bash-3.2$ cd package/
bash-3.2$ cd person/
bash-3.2$ cat Student.java
/**
*
*/
package person;
/**
*
*/
public class Student
{
	private int rollno;
	private  String name;
	private String gender;
	private int age;
  public Student(){}
	public Student(int rollno,String name,String gender,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
  public void setRollNo(int rollno)
  {
    this.rollno = rollno;
  }
  public void setName(String name)
  {
    this.name  = name;
  }
  public void setGender(String gender)
  {
    this.gender = gender;
  }
  public void setAge(int age)
  {
    this.age = age;
  }
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollno;
	}
