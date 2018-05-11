import java.util.*; 
import java.io.*;
public class Tennis{
	public static void main(String []args) throws Exception{
        System.out.println("\n-----------Welcome------------\n");
		System.out.print("Enter the File Name which Contains Player Details ");
        Scanner sin = new Scanner(System.in);
        File f1 = new File(sin.next());
		Scanner fin = new Scanner(f1);
		if(fin.hasNext())
        {
          //System.out.println("Inside if ");
          StringTokenizer st1 = new StringTokenizer(fin.nextLine(),"$%");
          int x = Integer.parseInt(st1.nextToken());
          String []s = new String[x];
          for(int i=0;i<x;i++)
              s[i] = st1.nextToken();
          int [][]arr = new int[x][6];
          int ind1 = 0,ind2 = 0;
          while(fin.hasNext()){
              //System.out.println("Inside While ");
              StringTokenizer st2 = new  StringTokenizer(fin.nextLine(),":");
              int count = st2.countTokens();
              for(int i=0; i<count; i++)
              {
               String m=st2.nextToken();
               for(int j = 0;j<4;j++){
                
                if(s[j].equals(m) && i==0){
                    //System.out.println("woo");
                    //System.out.println(s[j]);
					//arr[j][2]++;
                    ind1=j;
                    //System.out.println(count);
                }
               }
              for(int j=0;j<4;j++){
                if(s[j].equals(m) && i==1 ){
                   //   System.out.println(s[j]);
                  //  System.out.println("Boo");
                    //arr[j][4]++;
                    ind2=j;
                } 
               }
               if(i == 2){
               	StringTokenizer st3 = new StringTokenizer(m,",");
                int SetCount = st3.countTokens();
                //System.out.println(SetCount);
                if(st3.countTokens()>3){
                 arr[ind1][0]++;
                // System.out.println(s[ind1] + arr[ind1][0]);
                 while(st3.hasMoreTokens())
                 { 
                  StringTokenizer st4 = new StringTokenizer(st3.nextToken(),"-");
                  //String b=st4.nextToken();
                  //System.out.println(b);
                  int a = Integer.parseInt(st4.nextToken());
                  int y = Integer.parseInt(st4.nextToken());
                  if(a>y){
                      arr[ind1][2]++;
                      arr[ind2][4]++;
                  }
                  else{
                     arr[ind2][2]++;
                     arr[ind1][4]++;
                  }
                  arr[ind1][3] = arr[ind1][3] + a;
                  arr[ind1][5] = arr[ind1][5] + y;
                  arr[ind2][3] = arr[ind2][3] + y;
                  arr[ind2][5] = arr[ind2][5] + a;
                 }
                 }
                else if(st3.countTokens()<3){
                  arr[ind1][1]++;
                 // System.out.println(s[ind1] + arr[ind1][1]);
                 while(st3.hasMoreTokens())
                 { 
                  StringTokenizer st4 = new StringTokenizer(st3.nextToken(),"-");
                  int a = Integer.parseInt(st4.nextToken());
                  int y = Integer.parseInt(st4.nextToken());
                  if(a>y){
                      arr[ind1][2]++;
                      arr[ind2][4]++;
                  }
                  else{
                     arr[ind2][2]++;
                     arr[ind1][4]++;
                  }
                  arr[ind1][3] = arr[ind1][3] + a;
                  arr[ind1][5] = arr[ind1][5] + y;
                  arr[ind2][3] = arr[ind2][3] + y;
                  arr[ind2][5] = arr[ind2][5] + a;
                 }
                }
                else{
                 int count1=0;
                 while(st3.hasMoreTokens())
                 { 
                  StringTokenizer st4 = new StringTokenizer(st3.nextToken(),"-");
                  int a = Integer.parseInt(st4.nextToken());
                  int y = Integer.parseInt(st4.nextToken());
                  if(a>y){
                     arr[ind1][2]++;
                     arr[ind2][4]++;
                     count1++;
                  }
                  else if(a<y){
                     arr[ind2][2]++;
                     arr[ind1][4]++;
                  }
                  arr[ind1][3] = arr[ind1][3] + a;
                  arr[ind1][5] = arr[ind1][5] + y;
                  arr[ind2][3] = arr[ind2][3] + y;
                  arr[ind2][5] = arr[ind2][5] + a;
                 }
                 //System.out.println(count1);
                 if(count1!=3){
                    arr[ind1][1]++;
                 }
                 else{
                   arr[ind1][0]++;
                 }
                }
               }
              }           
          }
          for(int i=0;i<x;i++){
             System.out.print(s[i]);
            for(int j=0;j<6;j++)
             System.out.print("\t"+arr[i][j]);
           System.out.print("\n");
           }
		}
        
	}
}
