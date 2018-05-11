package objectclassmethods;

import java.util.Arrays;

public class Student
{
  private int rollno;
  private String name;
  private int[] mark;
  
  public Student(){}

  public Student(int rollno,String name,int[] mark)
  {
    this.rollno = rollno;
    this.name = name;
    this.mark = Arrays.copyOf(mark,mark.length);
  }
  
  public boolean equals(Object otr)
  {
    if(this==otr)
      return true;
    if(otr==null)
      return false;
    if(this.getClass()!=otr.getClass())
      return false;
    Student temp = (Student) otr;
    return this.rollno==temp.rollno &&
           this.name.equals(temp.name) &&
           Arrays.equals(this.mark,temp.mark);
  }

  public String toString()
  {
    String temp;
    temp = this.getClass().getName();
    temp = temp + "{ ";
    temp = temp + "Rollno : " + this.rollno + ", ";
    temp = temp + "Name : " + this.name + ", ";
    temp = temp + "Marks : " + Arrays.toString(this.mark);
    temp = temp + " }";
    return temp;
  }
}
