package queues;

public class QueueUseLL {

	public static void main(String[] args) throws Exception {
QueueUsingLL<Integer> q= new QueueUsingLL<>();
q.enqueue(1);
q.enqueue(4);
q.enqueue(4);
q.dequeue();
q.dequeue();
q.enqueue(9);
//System.out.println(q.dequeue());
//System.out.println(q.dequeue());
System.out.println(q.getSize());
System.out.println(q.peek());
	System.out.println(q.isEmpty());
q.PrintQueue();
	}

}
