package priorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) throws Exception {
		MinPriorityQueue q= new MinPriorityQueue();
		q.insert(10);
		q.insert(12);
		q.insert(6);
		q.printPriorityQueue();
		q.insert(1);
		System.out.println();
		q.printPriorityQueue();
		q.insert(3);
		System.out.println();
		q.printPriorityQueue();
		q.getMin();
		System.out.println();
	    q.printPriorityQueue();
	    System.out.println();
	    System.out.println(q.getSize());
	    q.insert(1);
	    System.out.println();
        q.printPriorityQueue();
	}

}
