import objectclassmethods.*;
import java.util.Date;
import java.util.Scanner;

public class StudentApplication
{
  public static void main(String[] args)
  {
	Scanner sin = new Scanner(System.in);
    Student studObj = null;
	Student studTemp;
    int rollno;
    String name;
    int[] mark = new int[3];
    String ugDegree;
    Date doj;
    int year,month,date;
    int choice1;
    int choice2;
    do
    {
      System.out.println("Welcome To Student Application");
      System.out.println("1.Student\n2.PGStudent\n3.Exit");
      System.out.println("Enter Your Option");
      choice1 = sin.nextInt();
      switch(choice1)
	  {
        case 1:
		  System.out.println("Enter Student Details");
		  System.out.print("Rollno : ");
		  rollno = sin.nextInt();
          System.out.print("\nName : ");
          name = sin.next();
          System.out.print("\nThree Marks : ");
          for(int i=0;i<3;i++)
            mark[i] = sin.nextInt();
          System.out.println();
          studObj = new Student(rollno,name,mark);
          break;
        case 2:
		  System.out.println("Enter PGStudent Details");
          System.out.print("Rollno : ");
          rollno = sin.nextInt();
          System.out.print("\nName : ");
          name = sin.next();
          System.out.print("\nThree Marks : ");
          for(int i=0;i<3;i++)
            mark[i] = sin.nextInt();
          System.out.println();
          System.out.print("UgDegree : ");
          ugDegree = sin.next();
          System.out.print("\nDateOfJoining\n");
          System.out.print("Year : ");
          year = sin.nextInt();
		  year -= 1900;
          System.out.print("Month : ");
          month = sin.nextInt();
		  month--;
          System.out.print("Date : ");
          date = sin.nextInt();
          doj = new Date(year,month,date);//check
          System.out.println();
          studObj = new PGStudent(rollno,name,mark,ugDegree,doj);
          break;
        case 3:
          System.out.println("Exit");
          break;
        default:
          System.out.println("Enter Valid Option");
          break;
      }

      if(choice1==1 || choice1==2)
	  {
        do
        {
          System.out.println("1.Equals Method\n2.ToString Method\n3.Exit");
          System.out.println("Enter Your Option");
          choice2 = sin.nextInt();
          switch(choice2)
          {
            case 1:
              System.out.println("Enter Student Details");
              System.out.print("Rollno : ");
              rollno = sin.nextInt();
              System.out.print("\nName : ");
              name = sin.next();
              System.out.print("\nThree Marks : ");
              for(int i=0;i<3;i++)
                mark[i] = sin.nextInt();
              System.out.println();
              if(choice1==2)
              {
                System.out.print("UgDegree : ");
                ugDegree = sin.next();
                System.out.print("\nDateOfJoining\n");
                System.out.print("Year : ");
                year = sin.nextInt();
				year -= 1900;
                System.out.print("Month : ");
                month = sin.nextInt();
				month--;
                System.out.print("Date : ");
                date = sin.nextInt();
                doj = new Date(year,month,date);//check
                System.out.println();
                studTemp = new PGStudent(rollno,name,mark,ugDegree,doj);
              }
              else
                studTemp = new Student(rollno,name,mark);
              if(studObj.equals(studTemp))
                System.out.println("Both Are Equal");
              else
                System.out.println("Both Are Not Equal");
              break;
            case 2:
              System.out.println(studObj.toString());
              break;
            case 3:
              System.out.println("Exit");
              break;
            default:
              System.out.println("Enter Valid Option");
              break;
          }
        }while(choice2!=3);
	  }
    }while(choice1!=3);
  }
}
