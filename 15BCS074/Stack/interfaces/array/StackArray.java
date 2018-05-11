package interfaces.array;
public class StackArray implements IStack{
	private int []array;
	private int top;
	public StackArray(){
		array = new int[MAX_SIZE];
		top = -1;
	}	

	public int currentElement(){
		if(isEmpty()){
			//System.out.println("Stack is Empty ");
			return -1;
		}
		else{
				return array[top];
		}
	}

	public boolean isFull(){
			return top == MAX_SIZE-1;
	}
	
	public boolean isEmpty(){
			return top == -1;
	}

	/** 0 for success and -1 for failure */
	public int push(int a){
			top++;
			if(!isFull()){
				array[top] = a;
				return 0;
			}
			else{
				//System.out.println("Stack is Full");
				return -1;
			}
	}

	public int pop(){
			if(!isEmpty()){
				return array[top--];
			}
			else{
				//System.out.println("Stack is Empty");
				return -1;
			}
	}

}
