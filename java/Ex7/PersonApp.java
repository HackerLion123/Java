import java.util.Date;

import java.util.Scanner;

import java.text.DateFormat;

public class PersonApp

{

	public static void main(String [] args) throws Exception

	{

		int pid;

		String name;

		Date dateOfBirth;

		double salary;

		String [] subjectTaught;

		int experience;

		int choice;

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the number of person : ");

		int size = scan.nextInt();

		Person []fac=new Person[size];

		int i,j;

		for(i=0;i<fac.length;i++)

		{

			System.out.print("Enter the id of person "+(i+1)+" : ");

			pid=scan.nextInt();

			System.out.print("Enter the name of person "+(i+1)+" : ");

			name=scan.next();

			System.out.print("Enter the dateOfBirth of person "+(i+1)+" : ");

			String []dt=scan.next().split("/");

			int year,day,month;

			year=Integer.parseInt(dt[2])-1900;

			month=Integer.parseInt(dt[1]);

			day=Integer.parseInt(dt[0]);

			/*day=scan.nextInt();

			month=scan.nextInt();

			year=scan.nextInt();*/

			dateOfBirth=new Date(year,month,day);

			System.out.print("Enter the salary of person "+(i+1)+" : ");

			salary=scan.nextDouble();

			System.out.print("Is the person "+(i+1)+" is a Teacher (y/n): ");

			char ch=scan.next().charAt(0);

			if(ch=='y')

			{

				System.out.print("Enter the subjectTaughts : ");

				String qual=scan.next();

				subjectTaught=qual.split(",");

				System.out.print("Enter the experience : ");

				experience=scan.nextInt();

				fac[i]=new Teacher(pid,name,dateOfBirth,salary,subjectTaught,experience);

			}

			else

			{

				fac[i]=new Person(pid,name,dateOfBirth,salary);

			}

		}

		do

		{

			System.out.println("********** MENU ***********");

			System.out.println("   1 - check for equality");

			System.out.println("   2 - Print using toString");

			System.out.println("   3 - Exit");

			System.out.println("***************************");

			choice=scan.nextInt();

			switch(choice)

			{

				case 1:

					System.out.print("Enter the index of two person to check :");

					i=scan.nextInt();

					j=scan.nextInt();

					if(i>=0&&i<fac.length)

					{

						if(j>=0&&j<fac.length)

						{

							if(fac[i].equals(fac[j]))

								System.out.println("Both refers to a same person ");

							else

								System.out.println("Both are not equal");

						}

						else

						{

							System.out.println("Second index is invalid");

						}

					}

					else

						{

							System.out.println("first index is invalid");

						}

					break;

				case 2:

					System.out.print("Enter the id of the person :");

					i=scan.nextInt();

					if(i>=0&&i<fac.length)

						System.out.println(fac[i]);

					else

						System.out.println("invalid index");

					break;

				case 3:

					break;

				default:

					System.out.println("Invalid choice");

					break;

			}

		}while(choice!=3);

	}

}
