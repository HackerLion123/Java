public class Employee
{
  int employeeId;
  String name;
  float salary;
  static int nextEmployeeId;
  static int noOfInstanceCreated;
  static
  {
    nextEmployeeId = 1;
  }
  {
    employeeId = nextEmployeeId++;
    noOfInstanceCreated++;
  }
  static void noOfInstanceCreated()
  {
    noOfInstanceCreated = 0;
  }
  static int getNoOfInstanceCreated()
  {
	  return noOfInstanceCreated;
  }
  Employee()
  {
    this("MepcoEmployee");
  }
  Employee(String aName)
  {
    this(aName,10000);
  }
  Employee(String aName,float aSalary)
  {
    name = aName;
    salary = aSalary;
  }
  Employee(Employee e)
  {
    employeeId = e.employeeId;
    name = e.name;
    salary = e.salary;
  }
  public String toString()
  {
    return "\t"+employeeId+"\t"+name+"\t\t"+salary;
  }
  float getSalary()
  {
    return salary;
  }
  void setName(String aName)
  {
    name = aName;
  }
  void setSalary(float aSalary)
  {
     salary = aSalary;
  }
  void copy(Employee e)
  {
	  this.employeeId = e.employeeId;
	  this.name = e.name;
	  this.salary = e.salary;
  }
}
