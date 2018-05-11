import java.util.*;
class Matrix{
	public static void main(String []arg){
         Scanner s=new Scanner(System.in);
         System.out.print("Enter the n value ");
         int n=s.nextInt();
         System.out.print("Enter the m value ");
         int m=s.nextInt();
         int [][]Mat=new int[n][m];
         int sum=0,a=0,rcount=0;
         for(int i=0;i<Mat.length;i++){
	  for(int j=0;j<Mat[i].length;j++){
	   Mat[i][j]=s.nextInt();
           sum=Mat[i][j]+0;
          }
          if(sum>a){
            a=sum;
           rcount=i;
          }
         }
         System.out.println("Row with Largest Summation "+rcount);
         for(int []row:Mat){
          System.out.println(Arrays.toString(row));
         }
        }
}
