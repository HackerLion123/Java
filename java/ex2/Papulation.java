import java.util.Arrays;
import java.util.Scanner;
public class Papulation
{
 public static void main(String[] args)
 {
  int No_State,No_District,No_City;
  Scanner p=new Scanner(System.in);
  System.out.print("Enter the number of states:\n");
  No_State=p.nextInt();
  System.out.print("Enter the number of districts:\n");
  No_District=p.nextInt();
  System.out.print("Enter the number of cities:\n");
  No_City=p.nextInt();
  int population[][][]=new int[No_State][No_District][No_City];
  for(int i=0;i<No_State;i++)
    for(int j=0;j<No_District;j++)
      for(int k=0;k<No_City;k++)
        {
         System.out.println("Enter the population of "+i+"th state "+j+"th district "+k+"th city:");
         population[i][j][k]=p.nextInt();
        }
  System.out.println("The population of all cities are:");
  System.out.println(Arrays.deepToString(population));
  System.out.println("The populations of all states are:");
  int result=0;
  for(int i=0;i<No_State;i++)
  {
    for(int j=0;j<No_District;j++)
      for(int k=0;k<No_City;k++)
        result+=population[i][j][k];
    System.out.println("The population of state "+i+" is "+result);
    result=0;

    }
  }
}


