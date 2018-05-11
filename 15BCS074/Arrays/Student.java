import java.util.*;
public class Student{
     private int rno;
     private string name;
     private string dept;
     private int []mark;
     private int avg;
     public Student copy()
     {
      Student m=new Student();
       
     }
     public setDetails(int x,string y,string z,int a[],int b){
       mark=new [3]int;
       rno=x;
       name=y;
       dept=z;
       mark=Arrays.copyOf(a);
       avg=getAvg(a);
     }
     public displayDetails(){
       System.out.println("Rollno : "+rno);
       System.out.println("Name : "+name);
       System.out.println("Department : "+dept);
       System.out.println("Averge : "+avg);
     }  
     public moreThan90(){
      if(avg>90)
        displayDetails();
     }
     public cseDepartment(){
     }
}
