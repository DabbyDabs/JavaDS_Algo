package linkedList;

public class MidPointofLL {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>();
		head.data = 2;
		Node<Integer> node1 = new Node<>(5);
		Node<Integer> node2 = new Node<>(33);
		Node<Integer> node3 = new Node<>(76);
		Node<Integer> node4 = new Node<>(56);
		Node<Integer> node5 = new Node<>(88);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(ReturnMidPointOfLL(head));

	}
public static int ReturnMidPointOfLL(Node<Integer> head) {
	Node<Integer> slow= new Node<>();
	Node<Integer> fast = new Node<>();
	slow=fast=head;
	while(fast.next!=null&&fast.next.next!=null) {
		fast=fast.next.next;
		slow= slow.next;
		
		
	}
	return slow.data;
	
}
}
