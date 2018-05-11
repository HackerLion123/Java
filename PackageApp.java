import Person.*;
import static java.lang.System.out;
public class PackageApp{
		public static void main(){
			int choice,ch;
            Scanner s=new Scanner();
            out.println("-------Welcome--------\n");
            out.println("1] Student");
            out.println("2] Employee");
            out.println("------------------------\n\n");
            out.print("Enter the Choice ");
            ch=s.nextInt();
            if(ch==1){
              out.println("--------Student---------");
              out.println("");
            }
            else if(ch==2){
            }
            else
              System.out.println(" Wrong Choice ");        
        }
}
