package queues;


public class QueueUsingArray<T> {
private T []line;
private int front;
private int rear;
private int size;

public QueueUsingArray(int size){
	line=  (T[]) new Object[size];
	front=-1;
	rear=-1;
	size=0;

}
public QueueUsingArray(){
	line=  (T[]) new Object[10];
	front=-1;
	rear=-1;
	size=0;

}
public boolean isEmpty() {
	return(front==-1&&rear==-1);
}
public int getSize() {
	return size;
}
public T peek() throws Exception {
	if(size==0) {
		Exception e= new QueueEmptyException();
		throw e;
		}
	return line[front];
}
public void Enqueue(T data) throws Exception {
	if(front==-1&&rear==-1) {
		size++;
		front=0;
		rear=0;
		line[front]=data;
		return;
	}
	if(line[rear+1-(line.length)*(rear/(line.length-1))]==null)
		{rear=rear+1-(line.length)*(rear/(line.length-1));
		line[rear]=data;
		size++;
		return;
		}
 if(size==line.length)
	DoubleCapacity(data);
	
}
public T Dequeue() throws Exception {
if(front==-1) {
	Exception e= new QueueEmptyException();
	throw e;
}
if(front==rear) {
	T temp=line[front];
	line[front]=null;
	rear=front=-1;
	size--;
	return temp;
}
T temp=line[front];
line[front]=null;
front=front+1-(line.length)*(front/(line.length-1));
size--;
return temp;
}
private  void DoubleCapacity(T data) {
	T[] temp=line;
	line= (T[]) new Object[2*line.length];
	int i=0;
	while(front!=rear) {
	line[i]=temp[front];
		front=(front+1)%(temp.length);
	i++;
	}
	line[i]=temp[rear];
	i++;
	line[i]=data;
	rear=i;
	front=0;
	size++;
	return;
}
public void QueuePrint() {
	int x=front;
	while(x!=rear) {
		System.out.print(line[x]+" ");
		x=(x+1)%(line.length);
		}
	System.out.print(line[rear]+" ");
	return;
}

	
}
