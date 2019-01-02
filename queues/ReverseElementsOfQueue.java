package queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseElementsOfQueue {

	public static void main(String[] args) throws Exception {
      QueueUsingArray<Integer> queue= new QueueUsingArray<>();
      for(int i=0;i<7;i++) {
    	  queue.Enqueue(i);
      }
      queueReverse(queue);
      }
 public static void queueReverse(QueueUsingArray<Integer> q) throws Exception {
	 int x=0;
	 int[] store= new int[q.getSize()];
	 while(!q.isEmpty()) {
		 store[x]=q.Dequeue();
		 x++;
	 }
	 x--;
	 while(x>=0) {
		 q.Enqueue(store[x]);
		 x--;
		 
	 }
	 q.QueuePrint();
	 
	 
 }
}
