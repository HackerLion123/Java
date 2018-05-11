package Person;
/**
*/
public class Employee{
			private String name;   /** Employee name @type String */
            private String empid;  /** Employee Id @type String */
            private float Salary;  /** Employee Salary @type float */
            private String Des;    /** Employee Desination @type String */
            
            public String toString(){
             String s="Name :"+name+"\nEmployee Id :"+empid+"\nSalary :"+Salary+"\nDesigination :"+Des;
             return s;  
            }
            public Employee(){
             this("","",0);
            }
            public Employee(String n,String emp,float sal){
             name=n;
             empid=emp;
             Salary=sal;
            // Des=des;
            }
}
