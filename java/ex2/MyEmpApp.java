import java.util.Scanner;
public class MyEmpApp
{
 public static void main(String[]arg)
 {
   Emp[] ed;
   Scanner sin=new Scanner(System.in);
   System.out.print("Enter the number of employee\n");
   int n=sin.nextInt();
   ed=new Emp[n];
   String x;
    String y;
   String p,q;
   int a;
   for(int i=0;i<ed.length;i++)
   {
    System.out.print("Enter the details\n");
    System.out.println("Enter the employer id :");
    x=sin.next();
    System.out.println("Enter the name of the employee :");
    p=sin.next();
    System.out.println("Enter the department of the employee:");
    q=sin.next();
    System.out.println("Enter the years of experience:");
    y=sin.next();
    System.out.println("Enter the salary:");
    a=sin.nextInt();
    ed[i]=new Emp();
    ed[i].setEmp(a,x,y,p,q);
   }
   int op;
   do
   {
     System.out.print("Menu\n");
     System.out.print("1.Display all the employee details\n2.Display employee experience equal to 5years\n 3.Display employee salary more than 10,000\n  4.Copy any one of employee details\n5.Exit\n");
     System.out.print("Enter the option\n");
     op=sin.nextInt();
     switch(op)
     { 
      case 1:
       for(int i=0;i<ed.length;i++)
      {
       ed[i].display();
      }
      break;
      case 2:
       for(int i=0;i<ed.length;i++)
       {
         if("5years".equals(ed[i].getexperience())
         ed[i].display();
         //ed[i].getexperience();
       }
       break;
      case 3:
       for(int i=0;i<ed.length;i++)
       {
        if(ed[i].getsalary()>=10000)
        ed[i].display();
       }
       break;
      case 4:
          int index;
          Emp t=new Emp();
    			t=ed[0].copy();
    			System.out.print("Enter the details to be copied:\n");
    			index=sin.nextInt()-1;
    			if(index>=0 && index<=ed.length);
    			{
    				t=ed[index].copy();
    				System.out.print("copied\n");
    				t.display();
    			}
    			break;
  	 	case 5:
     	{	
      	System.out.println("Exit\n");
     	}
     	break;
   }
    }while(op<5);
 }
}

