package interfaces;
public class StackList implements IStack{
		private int top;		
		private class Node{
				private int element;
				public Node next;
				void setElement(int a)
				{
					element=a;
				}
				int getElement()
				{
					return element;
				}
		}	
      public Node head;

		public StackList(){
				top = -1;
				head = new Node();
				head.next = null;
				
		}

		public int push(int a){
				top++;
				if(!isFull()){
					while(head.next != null){
						head = head.next;
					}
					head = head.next;
					head.setElement(a);
					head.next = null;
					return 0;
				}
				else{
					//System.out.println("Stack is Full");
					return -1;
				}
		}
		
		public int pop(){
			if(!isEmpty()){
				Node temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				int a = temp.getElement();
				temp = null;
				return a;
			}
			else
				return -1;
		}

		public int currentElement(){
			if(isEmpty())
				//System.out.println("Stack is Empty ");
				return -1;
			else{
				Node temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				int a = temp.getElement();
				//temp = null;
				return a;
			}
		}

            
		public boolean isFull(){

			return top == MAX_SIZE-1;
		}
	
		public boolean isEmpty(){
			return top == -1;
		}
		
}
