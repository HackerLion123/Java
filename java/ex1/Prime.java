import java.util.Scanner;
class Prime 
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=scan.nextInt();
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not a prime number");
				System.exit(0);
			}
		}
		System.out.println("It is a prime number");
	}
}


