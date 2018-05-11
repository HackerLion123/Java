import java.util.*;
class FindPrime{
	public static void main(String[]args)
        {
        	System.out.println("Enter a Number");
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
                //System.out.println(+count);
                System.out.println();
                if(count==2)
		  System.out.println("Prime");
                else 
                  System.out.println("Not a Prime");
        }
}
