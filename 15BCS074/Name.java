import java.util.*;
class FindPrime{
	public static void main(String[]args)
        {
        	System.OUT.println("Enter a Number");
		Scanner s=new Scanner(System.in);
                int num=s.nextInt();
                int count;
                count=0;
                for(int i=1;i<=num;i++){
			if(num%i==0)
                         {
                          count++;
                         }
                }
                //System.OUT.println(+count);
                System.OUT.println();
                if(count==2)
		  System.OUT.println("Prime");
                else 
                  System.OUT.println("Not a Prime");
        }
}
