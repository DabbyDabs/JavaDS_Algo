package stacks;

public class StackUsingLL <T>{
private Node<T>top;
private int size;

public StackUsingLL() {
	Node<T>top=new Node();
	size=0;
	
}

public void push(T data) {
	Node<T> add=new Node<>(data);
	add.next=top;
	top=add;
	size++;
}
	public T pop() throws Exception {
	if(size==0) {
		Exception e= new Exception();
		throw e;
	}
	Node temp= new Node();
	temp=top;
	top=top.next;
     temp.next=null;
     size--;
     return (T) temp.data;
}
	public boolean isEmpty() {
		return (top==null);
		
	}
	public int getSize() {
		return size;
	}
	public T peek() throws Exception {
		if(top==null) {
			Exception e= new StackEmptyException();
			throw e;	
		}
		return top.data;  
	}
	public void PrintStack() {
		Node temp= new Node();
		temp=top;
		System.out.print("top ");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}



