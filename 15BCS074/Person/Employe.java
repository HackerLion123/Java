package Person;
public class Employe{
      private String empId;
      public static int nextId;
      public static int noOfIns;
      private String name;
      private double Salary;
      static{
          nextId=000;
      }
      {
        nextId++;
        empId="15bcs"+nextId;
      }
      public static void noOfInstance(){
          noOfIns++;
      }
      Employe(){
        this("MepcoEmploye");

      }
      Employe(String n){
        this(n,10000);
      }
      Employe(String n,double sal){
        noOfInstance();
        name=n;
        Salary=sal;
      }
      Employe(Employe e){
       e.name=name;
       e.Salary=Salary;
       e.empId=empId;
      }
      public String toString(){
          String s="Name : "+name+"\nEmployee Id : "+empId+"\nSalary : "
          +Salary;
          return s;
      }
      public String getEmpId(){
        return empId;
      }      
}
