package linkedList;

public class CheckPalindrome {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>();
		head.data = 2;
		Node<Integer> node1 = new Node<>(5);
		Node<Integer> node2 = new Node<>(33);
		Node<Integer> node3 = new Node<>(33);
		Node<Integer> node4 = new Node<>(5);
		Node<Integer> node5 = new Node<>(2);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(checkPalindrome(head));
	}
public static boolean checkPalindrome(Node<Integer> head) {
	Node<Integer>temp= new Node<Integer>();
	temp=head;
	int x=0;
	while(temp!=null) {
		temp=temp.next;
		x++;
	}
	int[]arr= new int[x];
	temp=head;
	for(int i=0;i<x;i++)
	{
		arr[i]=temp.data;
		temp=temp.next;
	}
	for(int i=0;i<x/2;i++) {
		if(arr[i]==arr[x-i-1])
			continue;
		else return false;
	}
	return true;
	
}
public static void PrintArray(int[] arr) {
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	
}
}
