import java.util.*;

class New{
	public static int factorial(int n){
		if(n <= 1)
			return 1;
		else {	
			Exception t = new Exception();
			//StackTraceElement ste = t.getStackTraceElement();
			t.printStackTrace();
			return n*factorial(n-1);
		}
	}
}

public class StackTrace{
	
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		int n;
		System.out.print("Enter the value of n ");
		n = sin.nextInt();
		int ne = New.factorial(n);
		System.out.println("Factorial : " + ne);
	}
}
