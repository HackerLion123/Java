import java.util.*;

public class Student{
	private int rollno;
	private String name;
	private int[] mark;
	private double average;
	public boolean equals(Object othr){
		if(othr == null)
			return false;
		if(this == othr)
			return true;
		if(this.getClass() != othr.getClass())
			return false;
		Student temp = (Student)othr;
		return	temp.rollno == rollno &&
				(temp.name).equals(name) &&
				Arrays.toString(temp.mark).equals(Arrays.toString(mark));
	}
	
	public Student(int no,String name,int []arr){
		this.rollno = no;
		this.name = name;
		this.mark = Arrays.copyOf(arr,arr.length);
		this.average = findAvg(mark);
	}	
	
	public double findAvg(int []mark){
     	double sum=0,ab;
        for(int i=0;i<mark.length;i++)
          sum=mark[i]+sum;
        ab=sum/3;
        return ab;
     }		

	public String toString()
	{
		return "\n Name : " + name + "\n RollNo : " + rollno + "\n Average : "
		+ average;
	}
}
