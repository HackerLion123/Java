package objectclassmethods;

import java.util.Date;

public class PGStudent extends Student
{
  private String ugDegree;
  Date dateOfJoining = null;

  public PGStudent(){}

  public PGStudent(int rollno,String name,int[] mark,String ugDegree,Date doj)
  {
    super(rollno,name,mark);
    this.ugDegree = ugDegree;
    this.dateOfJoining = doj;
  }

  public boolean equals(Object otr)
  {
    if(super.equals(otr))
    {
      PGStudent temp = (PGStudent) otr;
      return this.ugDegree.equals(temp.ugDegree) &&
             this.dateOfJoining.toString().equals(temp.dateOfJoining.toString());
    }
    return false;
  }

  public String toString()
  {
    String temp;
    temp = this.getClass().getName();
    temp = temp + "{ ";
    temp = temp + super.toString();
    //temp = "{ ";
    temp = temp + "UGDegree : " + this.ugDegree + ", ";
    temp = temp + "DateOfJoining : " + this.dateOfJoining.toString();
    temp = temp + " }";
    return temp;
  }
}
