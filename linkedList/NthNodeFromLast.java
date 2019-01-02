package linkedList;

public class NthNodeFromLast {

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
		Node<Integer> m = new Node<>();
		m=returnNthNode(head,31);
		System.out.println(m.data);
	}
public static Node<Integer> returnNthNode(Node<Integer>head,int n) {
	Node<Integer> temp1= new Node<>();
	Node<Integer> temp2= new Node<>();
	temp1=head;
	for(int i=0;i<n;i++)
	{if(temp1.next==null)
		return null;
		temp1=temp1.next;
	}
	temp2=temp1;
	temp1=head;
	while(temp2.next!=null) {
		temp1=temp1.next;
		temp2= temp2.next;
		}
	return temp1;
	
	
}
}
