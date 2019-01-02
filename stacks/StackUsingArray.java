package stacks;

public class StackUsingArray<T> {
	private T []arr;
	private int top;

	public StackUsingArray(int size){
		arr=  (T[]) new Object[size];
		top=-1;
		
	}
	
	public StackUsingArray(){
		arr=  (T[]) new Object[10];
		top=-1;
		
	}
	public boolean isEmpty() {
		return(top==-1);
				}
	
	public int getSize() {
		return top+1;
	}
	public T peek() throws Exception {
		if(top==-1) {
		Exception m= new StackEmptyException();	
			throw m;
		}
		
		return arr[top];
		
	}
	
	public T pop() throws Exception {
		if(top==-1) {
			Exception m= new StackEmptyException();	
				throw m;
			}
		
		int x= top;
		top--;
		return arr[x];
		
	}
	public void push(T data) {
		if(top==arr.length-1)
		doubleCapacity();
		top++;
		arr[top]=data;
		
	}

	private void doubleCapacity() {
	T[]temp=arr;	
		arr=  (T[]) new Object[arr.length*2];
		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i];
		}
	}
	public void PrintStack() {
	int i=0;	
		while(i<=top) {
			System.out.print(arr[i]+" ");
			i++;
			
		}
		System.out.print("top");
	}
	
}
