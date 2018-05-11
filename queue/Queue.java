public class Queue <MyType>
{
	int front;
	int rear;
	MyType[] array;
	Queue()
	{
		front=-1;
		rear=-1;
		array=(MyType [])new Object[0];
	}
	Queue(int size)
	{
		front=-1;
		rear=-1;
		array=(MyType [])new Object[size];
	}
	private boolean isFull()
	{
		return (rear==array.length+1);
	}
	private boolean isEmpty()
	{
		return front==rear;
	}
	public boolean enqueue(MyType element)
	{
		if(front==-1 && rear==-1)
		{
			front=0;
			rear=0;
		}
		if(!isFull())
		{	
			array[rear]=element;
			rear++;
			return true;
		}
		else
			return false;
	}
	public MyType dequeue()
	{
		if(!isEmpty())
		{
			MyType element=array[front];
			front++;
			return element;
		}
		else
			return null;
	}
	public String toString()
	{
		String str="";
		for(int i=front;i<rear;i++)
			str+=" |"+array[i]+" |";
		return str;
	}

 /*
 public String getRef()
 {
  String temp="";
  for(int i=front;i<rear;i++)
  {
    Student s=array[i];
    temp="|"+Student.toString(s)+"|";
  }
  return temp;
 }*/
}
