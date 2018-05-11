import person.Student;
import person.Employee;
import java.util.*;
public class MyApp
{
	public static void main(String [] arg)
	{
		int n;
		Student [] ss;
		Employee [] ee;
		Scanner sin =new Scanner(System.in);
		System.out.print("Enter The Number Of Details	:");
		 n=sin.nextInt();
		ss=new Student[n];
		ee=new Employee[n];
		int a,d,e;
		String b,c;
		for(int i=0;i<ss.length;i++)
		{
			System.out.println("Enter The Student Details");
			System.out.print("Enter The RollNo	:");
			a=sin.nextInt();
			System.out.print("Enter The Name	:");
			b=sin.next();
			System.out.print("Enter The Gender	:");
			c=sin.next();
			System.out.print("Enter The Age		:");
			d=sin.nextInt();
			ss[i]=new Student(a,b,c,d);
			
		}
		for(int i=0;i<ee.length;i++)
		{
			System.out.println("Enter The Eployee Details");
			System.out.print("Enter The EmployeeId	:");
			a=sin.nextInt();
			System.out.print("Enter The EmployeeName 	:");
			b=sin.next();
			System.out.print("Enter The Gender	:");
			c=sin.next();
			System.out.print("Enter The Age		:");
			d=sin.nextInt();
			System.out.print("Enter The Salary	:");
			e=sin.nextInt();
			ee[i]=new Employee(a,b,c,d,e);
		}
		int opt;
		do
		{
			System.out.println("---------MENU---------\n1. Display Student Details\n2.Display Employee Details\n3.Exit\n");
			System.out.print("Enter Your Option	:");
			opt=sin.nextInt();
			switch(opt)
			{
				case 1:
					for(int i=0;i<ss.length;i++)
						ss[i].display();
					break;
				case 2:
					for(int i=0;i<ee.length;i++)
						ee[i].display();
					break;
				case 3:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Enter Valid Option");
					break;
			}
		}while(opt!=3);
	}	
	
		
}