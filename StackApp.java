import list.*;
import array.*;
import java.util.*;
import static java.lang.System.out;
public StackApp{
	public static void main(){
		Scanner s = new Scanner(System.in);
		int opt,opt1,ele;
		out.println("------------Welcome---------------\n\n\n");
		out.println("----Menu---\n");
		out.println("1]Array");
		out.println("2]List\n");
		out.println("-----------\n");
		out.print("Enter your choice ");
		opt = s.nextInt();
		IStack obj;
		do{
			switch(opt){
				case 1:
					obj = new StackArray();
					do(
						out.println("\tMenu\t\n");
						out.println("1]Push");
						out.println("2]Pop");
						out.println("3]Current Element");
						out.println("4]Exit\n");
						out.print("Enter your choice ");
						opt1 = s.nextInt();
						switch(opt1){
							case 1:
								out.print("Enter the element to be pushed ");
								ele = s.nextInt();
								if(obj.push(ele)<0)
								{
									out.println(" Stack is Full ");
								}							
								else{
									out.println(" Element is Pushed into Stack ");
								}
							break;
							case 2:
								int popped_element = obj.pop();
								if(popped_element<0)
								{
									out.println(" Stack is Empty ");
								}
								else
									out.println(popped_element);
							break;
							case 3:
								int current_element = obj.currentElement();
								if(current_element<0)
									out.println(" Stack is Empty ");
								else
									out.println(popped_element);
							break;
							case 4:
								out.println("Thank You");
							break;
							default:
								out.println("Invalid Selection");
							break;
						}
					}while(opt!=4);					
				break;
				case 2:
					obj = new StackList();
					do(
						out.println("\tMenu\t\n");
						out.println("1]Push");
						out.println("2]Pop");
						out.println("3]Current Element");
						out.println("4]Exit\n");
						out.print("Enter your choice ");
						opt1 = s.nextInt();
						switch(opt1){
							case 1:
								out.print("Enter the element to be pushed ");
								ele = s.nextInt();
								if(obj.push(ele)<0)
								{
									out.println(" Stack is Full ");
								}							
								else{
									out.println(" Element is Pushed into Stack ");
								}
							break;
							case 2:
								int popped_element = obj.pop();
								if(popped_element<0)
								{
									out.println(" Stack is Empty ");
								}
								else
									out.println(popped_element);
							break;
							case 3:
								int current_element = obj.currentElement();
								if(current_element<0)
									out.println(" Stack is Empty ");
								else
									out.println(popped_element);
							break;
							case 4:
								out.println("Thank You");
							break;
							default:
								out.println("Invalid Selection");
							break;
						}
					}while(opt!=4);					
				break;
				default:
					out.println("Invalid Selection");
				break;
			}
		}while(opt<1 || opt>2);
} 
 
