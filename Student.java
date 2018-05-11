import java.util.*;
public class Student{
     private String rno;
     private String name;
     private String dept;
     private int []mark;
     private double avg;

     public void copyDetails(Student s1)
     {
      s1.mark=new int[3];
      s1.rno=rno;
      s1.name=name;
      s1.dept=dept;
      for(int i=0;i<mark.length;i++)
        s1.mark[i]=mark[i];
      s1.avg=avg;
     }

     public void displayDetails()
     {
      System.out.println("*****Details*****");
      System.out.println("Name : "+rno);
      System.out.println("RollNo : "+name);
      System.out.println("Department :"+dept);
      for(int i=0;i<mark.length;i++)
       System.out.println("Mark : "+mark[i]);
      System.out.println("Average : "+avg);
      System.out.println("*****************\n");
     }
     public double findAvg(int []mark){
     	double sum=0,ab;
        for(int i=0;i<mark.length;i++)
          sum=mark[i]+sum;
        ab=sum/3;
        return ab;
     }
     public void setDetails(String x,String y,String z,int a[]){
       mark=new int[3];
       rno=x;
       name=y;
       dept=z;
       mark[0]=a[0];
       mark[1]=a[1];
       mark[2]=a[2];
       avg=findAvg(a);
     } 
     public double getAverage(){
          return avg;
     }
     public String getRollNo(){
        return rno;
     }
     public String getDepartment(){
        return dept;
     }      
}
