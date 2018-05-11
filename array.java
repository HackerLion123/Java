import java.util.*;
class Array{
	public static void main(String []args){
                int state,district,cities;
                Scanner s=new Scanner(System.in);
                System.out.println("Enter the Number of States ");
                state=s.nextInt();
                int [][][]people=new int[state][][];
                int population=0;
               // System.out.println("Number of cities per state is set to 2");
                for(int i=0;i<people.length;i++){
		 System.out.print("Enter the number of district in state "+(i+1)+" ");
                 int n=s.nextInt();
                 people[i]=new int[n][];
                 for(int j=0;j<people[i].length;j++){
                  System.out.print("\nEnter the number of cities in District "+(j+1)+" ");
                  int m=s.nextInt();
                  people[i][j]=new int[m];
                  for(int k=0;k<people[i][j].length;k++){
                   System.out.print("Enter the population in city "+(k+1)+" ");
                   people[i][j][k]=s.nextInt();
 		   population=people[i][j][k]+population;
                  }
                  System.out.println("");
                 }
                 System.out.println("\npopulation in State "+(i+1)+" "+population+"\n");
                 System.out.println(Arrays.deepToString(people[i])+"\n");
                 population=0;
                }
        }
}
