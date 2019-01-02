package queues;

import java.util.Queue;

public class QueueUse {

	public static void main(String[] args) throws Exception {
		QueueUsingArray<Integer> q= new QueueUsingArray<>(5);
	for(int i=0;i<20;i++) {
		q.Enqueue(i);
		
	}
	q.Dequeue();
System.out.println(q.getSize());
System.out.println(q.isEmpty());
System.out.println(q.peek());
q.QueuePrint();
Queue<Integer>q1=null;
q1.add(9);
System.out.println(q.peek());
	
	}

}
