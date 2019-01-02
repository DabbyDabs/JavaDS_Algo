package linkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>();
		head.data = 2;
		Node<Integer> node1 = new Node<>(2);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(1);
		Node<Integer> node4 = new Node<>(1);
		Node<Integer> node5 = new Node<>(1);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		PrintLL(removeDuplicates(head));
		
	}
public static Node<Integer> removeDuplicates(Node<Integer> head){
	Node<Integer>temp1= new Node<>();
	Node<Integer>temp2=new Node<>();
	temp1=temp2=head;
	while(temp1!=null&& temp2!=null)
	{while(temp1.next!=null&&temp1.next.data==temp2.data) {
	temp1=temp1.next;
	}
	temp2.next=temp1.next;
	temp1=temp1.next;
	temp2=temp1;
	}
	return head;
}
public static void PrintLL(Node<Integer> head) {
	Node<Integer> temp = new Node<>();
	temp = head;
	while (temp != null) {
		System.out.print(temp.data + " ");
		temp = temp.next;

	}
}

}
