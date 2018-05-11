import java.util.*;
import static java.lang.System.out;
public class StudentApp{
	public static void main(String []args){
		int rollno;
		String name;
		int[] mark = new int[3];
		float average;
		Student obj;
		Scanner sin = new Scanner(System.in);

		out.println("Enter the Student Details \n");
		out.print("Name : ");
		name = sin.next(); 
		out.print("Roll No : ");
		rollno = sin.nextInt();
		out.println("Marks  : ");
		for(int i = 0; i < mark.length; i ++)
			mark[i] = sin.nextInt();
		
		obj = new Student(rollno,name,mark);
		out.println(obj.toString());
	}
}
