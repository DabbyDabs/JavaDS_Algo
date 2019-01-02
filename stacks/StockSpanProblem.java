package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) throws Exception {

int[] arr= {6,6,6,6,6,6,6,6};

printArray(StockSpan(arr));
	}
public static int[] StockSpan(int []arr) throws Exception {
	Stack<Integer> record=new Stack<>();
	record.push(arr[0]);
     arr[0]=1;
	int count=1;
	ArrayList<Integer>container=new ArrayList<>();
for(int i=1;i<arr.length;i++) {
		if(arr[i]>record.peek()) {
			while(record.size()!=0&&arr[i]>record.peek()) {
			count++;
				container.add(record.pop());
				}
		    while(container.size()!=0) {
			record.push(container.remove(0));
			}
		    record.push(arr[i]);
			arr[i]=count;
			count=1;
			continue;
		}
		if(arr[i]<=record.peek()) {
			count=1;
			record.push(arr[i]);
			arr[i]=count;
			
			
		}
		
		
		
	}
return arr;	
}
public static void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
