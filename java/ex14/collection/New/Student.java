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
  a="id="+id+"\tName="+name+"\tAge="+age+"\t";
  return a;
 }
}
