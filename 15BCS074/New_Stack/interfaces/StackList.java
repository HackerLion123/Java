package interfaces;
public class StackList implements IStack{
		private int top;		
      	public Node head;

		public StackList(){
				top = -1;
		}

		public int push(int a){
				top++;
				Node node = new Node();
				node.setElement(a);
				if(!isFull()){
					if(head == null)
					{
						head = new Node();					
						head = node;
					}
					else{
						head = head.next;
						head.next = node; 
					}
					return 0;
				}
				else
					//System.out.println("Stack is Full");
					return -1;
		}
		
		public int pop(){
			if(!isEmpty()){
				Node temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				int a = temp.getElement();
				--top;
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

		public void printStack(){
			Node temp = head;
			while(temp != null){
				System.out.println(temp.getElement());
				temp = temp.next;
			}
		}
		
}
