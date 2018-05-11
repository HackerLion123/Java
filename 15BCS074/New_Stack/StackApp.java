import interfaces.*;
import java.util.*;
import static java.lang.System.out;
public class StackApp{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		int opt,opt1,ele;
		IStack obj = null;
		out.println("------------Welcome---------------\n\n\n");
		out.println("----Menu---\n");
		out.println("1]Array");
		out.println("2]List\n");
		out.println("-----------\n");
		out.print("Enter your choice ");
		opt = s.nextInt();
		do{
			switch(opt){
				case 1:
					obj = new StackArray();  					
				break;

				case 2:
					obj = new StackList();					
				break;

				default:
					out.println("Invalid Selection");
				break;
			}
		}while(opt>1 && opt<2);

		do{
			out.println("\tMenu\t\n");
			out.println("1]Push");
			out.println("2]Pop");
			out.println("3]Current Element");
			out.println("4]Print Stack");
			out.println("5]Exit\n");
			out.print("Enter your choice ");
			opt1 = s.nextInt();
			switch(opt1){
				case 1:
					out.print("Enter the element to be pushed ");
					ele = s.nextInt();
					if(obj.push(ele)<0)
						out.println(" Stack is Full \n");
					else
						out.println(" Element is inserted into the stack \n");
				break;
				case 2:
					int popped_element = obj.pop();
					if(popped_element < 0)
						out.println(" Stack is Empty \n");
					else
						out.println(popped_element);
				break;
				case 3:
					int current_element = obj.currentElement();
					if(current_element < 0)
						out.println(" Stack is Empty \n");
					else
						out.println("Current Top : " + current_element+"\n");
				break;
				case 4:
					obj.printStack();
				break;
				case 5:
					out.println(" Thank you \n");
				break;
				default:
					out.println("Invalid Selection");
				break;
			}
		}while(opt1 != 5);
	}
}
