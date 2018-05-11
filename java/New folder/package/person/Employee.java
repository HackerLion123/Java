package person;
public  class Employee
{
	private int emp_id;
	private String emp_name;
	private String gender;
	private int age;
	private int salary;
	public Employee(int emp_id,String emp_name,String gender,int age,int salary)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.gender=gender;
		this.age=age;
		this.salary=salary;
	}
	public String getemp_name()
	{
		return emp_name;
	}
	public String getgender()
	{
		return gender;
	}
	public int getemp_id()
	{
		return emp_id;
	}
	public int getsalary()
	{
		return salary;
	}
	public int getage()
	{
		return age;
	}
	public void display()
	{
		System.out.println("EMP_ID	:"+emp_id+"\nEMP_NAME:"+emp_name+"\nGENDER	:"+gender+"\nAGE	:"+age+"\nSALARY	:"+salary+"\n");
	}
	public Employee(){}
}