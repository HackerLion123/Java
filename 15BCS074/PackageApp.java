import Person.*;
import java.util.*;
import static java.lang.System.out;
/**
 * Defines the operation of Packages 
 * @author :Bharath
 * @version :1.0
*/

public class PackageApp{
		public static void main(String [] args){
			   int choice,ch,n;
            String id,name;
            float sal;
            int []mark = new int[3];
            Scanner s = new Scanner(System.in);
            do{
            out.println("-------Welcome--------\n");
            out.println("1] Student");
            out.println("2] Employee");
            out.println("3] Exit");
            out.println("------------------------\n\n");
            out.print("Enter the Choice ");
            ch=s.nextInt();
            switch(ch){
             case 1:
              out.print("Enter the no of details ");
              n =s.nextInt();
              Student []obj = new Student[n];
              for(int i=0;i<n;i++){
               out.println("--------Student---------");
               out.print("Name : ");
               name = s.next();
               out.print("RollNo : ");
               id = s.next();
               out.print("Mark : ");
               mark[0] = s.nextInt();
               mark[1] = s.nextInt();
               mark[2] = s.nextInt();
               obj[i] = new Student(name,id,mark);
              }
              for(int i=0;i<n;i++){
                String m=obj[i].toString();
                out.println(m);
              }
             break;
             case 2:
              out.print("Enter the no of details ");
              n = s.nextInt();
              Employee []obj2 = new Employee[n];
              for(int i=0;i<n;i++){
               out.println("--------Employee---------");
               out.print("Name : ");
               name = s.next();
               out.print("EmpId : ");
               id = s.next();
               out.print("Salary : ");
               sal = s.nextFloat();
               obj2[i] = new Employee(name,id,sal);
              } 
              for(int i=0;i<n;i++){
                String l=obj2[i].toString();
                out.println(l);
              }
             break;
             case 3:
               out.println("Thank You");
             break;
             default:
              out.println(" Wrong Choice ");
             break;        
        }
      }while(ch!=3);
     }
   }
