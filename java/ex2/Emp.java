public class Emp
{
 private String name,dept;
 private String eid;
 private String experience;
 private int salary;
 public void setEmp(int a,String x,String y,String p,String q)
 {
  salary=a;
  eid=x;
  experience=y;
  name=p;
  dept=q;
 }
 public void display()
 {
  System.out.print("eid:"+eid+"\n name:"+name+"\n dept:"+dept+"\n experience:"+experience+"\n salary:"+salary+"\n");
 }
 public String getexperience()

 {
//  if(experience>5)
  return experience;
 }
 public int getsalary()
 {
  return salary;
 }
 public Emp copy()
 {
  Emp temp=new Emp();
  temp.salary=salary;
  temp.eid=eid;
  temp.experience=experience;
  temp.name=name;
  temp.dept=dept;
  return temp;
 }
}

