import java.lang.System.out;
import java.util.*;
public class ObjectClass{
		private int rollno;
		private String name;
		private int[]mark = new int[3];
		private float averge;
		public boolean equals(Object othr){
				if(othr == null)
					return false;
				if(this == othr)
					return true;
				if(this.getClass != othr.getClass)
					return false;
				return rollno == othr.rollno  &&
						 name.equals(othr.name) &&
						 Arrays.toString(mark).equals(Arrays.toString(othr.mark));
		}
		public String toString(Object e){
			return e.getClass().getName() + "[" + "\n\tRollno : " + rollno + "\n\tName : " + "\n\tMark : " + Arrays.toString(mark)+"\n]\n";
		}
}
