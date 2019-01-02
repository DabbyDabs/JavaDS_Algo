package linkedList;

public class ReverseLLRecursively {

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
		
	Node<Integer> Head= new Node<>();
		Node<Integer>temp= new Node<>();
		Head=RecurRevLL(head,head.next,Head,temp);
		while(Head!=null) {
			System.out.print(Head.data);
			Head=Head.next;
			
		}
	}
public static Node<Integer> RecurRevLL(Node<Integer> head, Node<Integer> nhead ,Node<Integer>Head,Node<Integer>temp){
	if(nhead.next==null) {
		Head=nhead;
		Head.next=head;
		return Head;
	}
		
	if(nhead.next!=null)
	Head=RecurRevLL(nhead,nhead.next,Head,temp);
	temp=Head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=head;
	return Head;
	
	
	
	
}
}
