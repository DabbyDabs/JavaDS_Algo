package queues;
import linkedList.Node;
public class QueueUsingLL<T> {
 private int size;
 private Node front;
 private Node rear;

 public QueueUsingLL() {
 front=null;	
 rear= null;
 
 size=0;
 }
 public void enqueue(T data) {
 if(front==null) {
	 Node<T> temp=new Node<>(data);
	 front=temp;
	 rear=front;
	 size++;
	 return;
	 
 }
 Node<T> nyanode= new Node<>(data);
 rear.next=nyanode;
 rear=nyanode;
 size++;
 }
 public T dequeue() {
	 Node<T>temp= new Node();
	if(front!=rear) {
	 temp=front;
	 front=front.next;
	 temp.next=null;
	 size--;
	 return temp.data;
	}
	temp=front;
	front=null;
	size--;
	return temp.data;
	 
 }
 public boolean isEmpty() {
	 return (front==null);
 }
 public T peek() throws Exception {
	if(front==null) {
	Exception e= new QueueEmptyException();
	throw e;
	}
	 return (T) front.data;
	}
 public int getSize() {
	 return size;
 }
 public void PrintQueue() {
	 Node<T> temp=new Node<>();
	 temp=front;
	 while(temp!=null) {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
 }
 
}
