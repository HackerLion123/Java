import java.util.Date;
public class Person
{
	private int pid;
	private String name;
	private Date dateOfBirth;
	public double salary;
	public Person() {};
	public Person(int pid,String name,Date dateOfBirth,double Salary)
	{
		this.pid=pid;
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.salary=salary;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Person temp=(Person)obj;
		return this.pid==temp.pid &&
					 this.name.equals(temp.name) &&
					 this.dateOfBirth.equals(temp.dateOfBirth) &&
					 this.salary==temp.salary;
	}
	public String toString()
	{
		String temp=this.getClass().getName();
		temp=temp+"[ ";
		temp=temp+"pid = "+this.pid+" , ";
		temp=temp+"name = "+this.name+" , ";
		temp=temp+"dateOfJoinig = "+this.dateOfBirth+" , ";
		temp=temp+"salary = "+this.salary.toString();
		temp=temp+" ]";
		return temp;
	}
}
