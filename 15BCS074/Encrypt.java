import java.util.*;
class Encrypt{
	public static void main(String[]arg){
		System.out.println("Enter the number");
                Scanner s=new Scanner(System.in);
                int num=s.nextInt(),temp,ans=0;
                if(num%3==0 && num<100000)
		{
		  int length=String.valueOf(num).length();
                  for(int i=0;i<length;i++)
                  {
                   temp=num%10;
                   temp=(temp+7)%10;
                   //System.out.print(+temp);
                   for(int j=0;j<i;j++)
                      temp=temp*10;
                   ans=ans+temp;
                   num=num/10;
                  }
                 ans=ans*10+length;
		System.out.println(+ans);
               }
              else
              {
                System.out.println("Wrong Input"); 
              }       
	}
}
