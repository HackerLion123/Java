import java.util.Scanner;
public class StudentApp
{
	public static void main(String[] arg)
	{
		String rollno,name,dept;
		int[] mark = new int[3];
		float avg;
		int ns,chioce,sum,src,des;
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter The Number Of Students");
		ns = sin.nextInt();
		Student[] S = new Student[ns];
		for(int i=0;i<S.length;i++)
			S[i] = new Student();
		for(int i=0;i<S.length;i++)
		{
			System.out.println("Enter The Student "+(i+1)+"Details");
			System.out.println("Enter The Student Rollno");
			rollno = sin.next();
			System.out.println("Enter The Student Name");
			name = sin.next();
			System.out.println("Enter The Department");
			dept = sin.next();
			sum = 0;
			for(int j=0;j<mark.length;j++)
			{
				System.out.println("Enter The Student Mark "+(j+1));
				mark[j] = sin.nextInt();
				sum+=mark[j];
			}
			avg = sum/mark.length;
			S[i].setDetails(rollno,name,dept,mark,avg);
		}
		do
		{
			System.out.println("------menu------");
			System.out.println("1.Display All The Student Details");
			System.out.println("2.Display The Student Details Who Secured More Then 90%");
			System.out.println("3.Display The Student Details Who Are Belongs To CSE Department");
			System.out.println("4.Copy The Student Details");
			System.out.println("5.Exit");
			System.out.println("Enter Your Option");
			chioce = sin.nextInt();
			switch(chioce)
			{
				case 1:
						for(int i=0;i<S.length;i++)
						{
							System.out.println("Details Of Student "+(i+1));
							S[i].display();
						}
						break;
				case 2:
						for(int i=0;i<S.length;i++)
						{
							if(S[i].getAvg()>90.0)
								S[i].display();
						}
						break;
				case 3:
						for(int i=0;i<S.length;i++)
						{
							if(S[i].getDept().equals("CSE"))
								S[i].display();
						}
						break;
				case 4:
						System.out.println("Enter The Source Student Detail");
						src = sin.nextInt();
						System.out.println("Enter The Destination Student Detail");
						des = sin.nextInt();
						S[des-1] = S[src-1].copyDetails();
						System.out.println("Copied Successfully");
						break;
				case 5:
						System.out.println("Exit");
						break;
				default:
						System.out.println("Enter Valid Option");
						break;
			}
		}while(chioce!=5);
		
	}
}