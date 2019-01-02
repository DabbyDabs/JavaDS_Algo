package priorityQueue;

import java.util.ArrayList;

public class MinPriorityQueue {
	private ArrayList<Integer> heap;

	MinPriorityQueue() {
		ArrayList<Integer> h = new ArrayList<Integer>();
	this.heap=h;
	}

	int getSize() {
		return heap.size();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	void insert(int data) {
		heap.add(data);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
			}
			childIndex = parentIndex;
			parentIndex = (childIndex - 1) / 2;

		}
	}
	int getMin() throws Exception {
		if(heap.size()==0) {
			Exception e= new PriorityQueueEmptyException();
			throw e;
	 } 
int min=heap.get(0);
heap.set(0,heap.get(heap.size()-1));
heap.remove(heap.size()-1);
int parentIndex=0;
downwardsHeapify(parentIndex, heap);
return min;
	}
void downwardsHeapify(int parentIndex,ArrayList<Integer> heap) {
	int leftChildIndex=2*(parentIndex)+1;
	int rightChildIndex=2*(parentIndex)+2;
	
	if(leftChildIndex>heap.size()-1) {
		return;
	}
	int flag=0;
	if(rightChildIndex>heap.size()-1) {
		flag=1;
	}
	if(heap.get(leftChildIndex)<heap.get(parentIndex)) {
		int temp = heap.get(leftChildIndex);
		heap.set(leftChildIndex, heap.get(parentIndex));
		heap.set(parentIndex, temp);
		parentIndex=leftChildIndex;
		downwardsHeapify(parentIndex, heap);
		return;
	}
	if(flag==0 && heap.get(rightChildIndex)<heap.get(parentIndex)) {
		int temp = heap.get(rightChildIndex);
		heap.set(rightChildIndex, heap.get(parentIndex));
		heap.set(parentIndex, temp);
		parentIndex=rightChildIndex;
		downwardsHeapify(parentIndex, heap);
		return;
	}
	return;
	
}
void printPriorityQueue() {
	for(int i=0;i<heap.size();i++) {
		System.out.print(heap.get(i)+" ");
	}
}
}
