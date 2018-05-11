package Person;
/**
 *
*/
public class Student{
			private String name;
            private String rollno;
            private int []mark;
            private double avg;
            public Student(String n,String rno,int []arr){
               mark = new int[3];
               name=n;
               rollno=rno;
               for(int i=0;i<arr.length;i++)
                   mark[i]=arr[i];
               avg=findAvg(arr);
            }
           public Student(){
               mark = new int[3];
            }          
            public String toString(){
              String Student="Name: "+name+"\nRollno: "+rollno+"\n Averge"+avg;
              return Student;
            }
            public double findAvg(int []mark){
     	      double sum=0,ab;
              for(int i=0;i<mark.length;i++)
              sum=mark[i]+sum;
              ab=sum/3;
              return ab;
            }
}
