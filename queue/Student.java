public class Student
{
 int id,age;
 String name;
 public Student(int sid,String sname,int sage)
 {
  id=sid;
  name=sname;
  age=sage;
 }
 public String toString()
 {
  String a="";
  a=" id="+id+" Name="+name+" Age="+age;
  return a;
 }
}
