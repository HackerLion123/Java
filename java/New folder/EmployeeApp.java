import java.util.Scanner;
public class EmployeeApp
{
  static
  {
    System.out.println("Welcome To My Employee Application");
  }
  public static void main(String[] arg)
  {
	  int choice;
    Scanner sin = new Scanner(System.in);
    System.out.println("Enter The Number Of Employee's To Be Handle");
    int esize = sin.nextInt();
    Employee[] E = new Employee[esize];
    for(int i=0;i<E.length;i++)
    {
      System.out.println("Enter The Employee "+(1+i)+" Details");
      System.out.print("Enter Name :");
      String name = sin.next();
      System.out.println("\n");
      System.out.print("Enter Salary :");
      float salary = sin.nextFloat();
      System.out.println("\n");
      E[i] = new Employee(name,salary);
    }
    do
    {
	  System.out.println("------Menu------");
      System.out.println("1.Display All Employee Details");
      System.out.println("2.Display Employee Deatils Based On Salary");
      System.out.println("3.Copy One Employee Deatils To Another");
      System.out.println("4.Exit\nEnter Your Option");
      choice = sin.nextInt();
      switch(choice)
      {
        case 1:
              System.out.println("EmployeeID\tName\t\tSalary");
              for(int i=0;i<E.length;i++)
                System.out.println(E[i].toString());
              break;
        case 2:
              System.out.println("Enter The Salary");
              float salary = sin.nextFloat();
              System.out.println("EmployeeID\tName\tSalary");
              for(int i=0;i<E.length;i++)
              {
                if(salary<=E[i].getSalary())
                {
                  System.out.println(E[i].toString());
                }
              }
              break;
        case 3:
              System.out.println("Enter The Source Employee");
              int src = sin.nextInt();
              System.out.println("Enter The Destination Employee");
              int des = sin.nextInt();
			  E[des-1].copy(E[src-1]);
              System.out.println("Copied Successfully");
              break;
        case 4:
              System.out.println("Exit");
              break;
        default:
              System.out.println("Enter Valid Option");
              break;
      }
    }while(choice!=4);
	System.out.println("Number Of Instance Created : "+Employee.getNoOfInstanceCreated());
  }
}
