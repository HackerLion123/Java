import java.util.*;
public class MyClass{
  public static void main(String[]args){
     int choice,n;
     String  rno,name,dept;
     int []mark=new int[3];
     System.out.print("Enter the No of Details you want to enter ");
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     Student []obj=new Student[n];
     for(int i=0;i<obj.length;i++){
        obj[i]=new Student();
	System.out.println(" Details of Student "+(i+1));
        System.out.print("Roll no : ");
        rno=s.next();
        System.out.print("Name : ");
        name=s.next();
        System.out.print("Department : ");
        dept=s.next();
        System.out.print("Marks Scored : ");
        for(int j=0;j<mark.length;j++)
          mark[j]=s.nextInt();
        obj[i].setDetails(rno,name,dept,mark);
     }

     do{
      System.out.println("*********************************************************");
      System.out.println("\t 1]Display all Details");
      System.out.println("\t 2]Display Students who have scored More than 90");
      System.out.println("\t 3]Display Students who belong to CSE");
      System.out.println("\t 4]Copy a Student Detail");
      System.out.println("\t 5]Exit");
      System.out.println("********************************************************\n");
      System.out.print("Enter the Choice ");

      choice=s.nextInt();
      switch(choice){
       case 1:
       for(int i=0;i<obj.length;i++){
         obj[i].displayDetails();
       }         
       break;
       case 2:
       for(int i=0;i<obj.length;i++){
         if(obj[i].getAverage()>90)
          obj[i].displayDetails();
       }    
       break;
       case 3:
       for(int i=0;i<obj.length;i++){
         if("cse".equals(obj[i].getDepartment()) || "CSE".equals(obj[i].getDepartment())){
          obj[i].displayDetails();
         }
       } 
       break;
       case 4:
        Student co=new Student();
        System.out.println("Enter the Student rollno you wanna copy ");
        rno=s.next();
        for(int i=0;i<obj.length;i++){
         if(rno.equals(obj[i].getRollNo())){
          obj[i].copyDetails(co);
          System.out.println("Copied");
          break;
         }
       }
       break;
       case 5:
        System.out.println("Thank You");
       break;
       default:
         System.out.println("Wrong Choice");
       break;
      }
     }while(choice!=5);
  }
}
