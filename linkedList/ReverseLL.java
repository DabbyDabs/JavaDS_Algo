package linkedList;

import java.util.Stack;

public class ReverseLL {

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
		

//				head = reverseLL(head);
//		while (head != null) {
//			System.out.print(head.data + " ");
//			head = head.next;
//		}
		
		head=reverseLLusingStack(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	public static Node<Integer> reverseLL(Node<Integer> head) {
		Node<Integer> temp1 = new Node<>();
		Node<Integer> temp2 = new Node<>();
		Node<Integer> temp3 = new Node<>();
		Node<Integer> interchange = new Node<>();
		temp1 = head;
		temp2 = head.next;

		temp3 = head.next.next;

		int x = 0;
		while (temp2.next != null) {
			if (x == 0) {
				temp2.next = temp1;
				temp1.next = null;
				temp1 = temp3.next;

				interchange = temp1;
				temp1 = temp3;
				temp3 = interchange;

				interchange = temp2;
				temp2 = temp1;
				temp1 = interchange;
				x++;
				continue;

			}
			temp2.next = temp1;
			temp1 = temp3.next;
			interchange = temp1;
			temp1 = temp3;
			temp3 = interchange;
			interchange = temp2;
			temp2 = temp1;
			temp1 = interchange;
			x++;

		}
		temp2.next = temp1;
		head = temp2;
		return head;
	}
public static Node<Integer>reverseLLusingStack(Node<Integer> head){
	Stack<Node>s=new Stack<>(); 
	Node<Integer>temp= new Node<>();
	temp=head;
	while(temp!=null) {
		s.add(temp);
		temp=temp.next;
	}
	head=s.pop();
	temp=head;
	while(!s.isEmpty()) {
		temp.next=s.pop();
		temp=temp.next;
		
	}
	temp.next=null;
	return head;
}
}
